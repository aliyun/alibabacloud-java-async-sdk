package com.aliyun.sdk.service.oss20190517.presigner.internal;

import com.aliyun.core.http.BodyType;
import com.aliyun.core.http.HttpHeaders;
import com.aliyun.core.http.HttpMethod;
import com.aliyun.core.utils.AttributeMap;
import com.aliyun.sdk.gateway.oss.internal.interceptor.AttributeKey;
import com.aliyun.sdk.service.oss20190517.presigner.PresignerClient;
import com.aliyun.sdk.service.oss20190517.presigner.models.*;
import darabonba.core.*;
import darabonba.core.client.ClientConfiguration;
import darabonba.core.client.ClientExecutionParams;
import darabonba.core.client.ClientOption;
import darabonba.core.exception.TeaException;
import darabonba.core.interceptor.InterceptorChain;
import darabonba.core.interceptor.InterceptorContext;
import darabonba.core.utils.CommonUtil;

import java.net.URL;
import java.time.Instant;
import java.util.Map;

public class DefaultPresignerClient implements PresignerClient {
    protected final TeaRequest REQUEST;
    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final ClientConfiguration configuration;

    protected DefaultPresignerClient(ClientConfiguration configuration) {
        this.product = "Oss";
        this.version = "2019-05-17";
        this.endpointRule = "";
        this.configuration = configuration;
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(new java.util.HashMap<>()).setVersion(version);
    }

    @Override
    public PutObjectPresignResponse presignPutObject(PutObjectPresignRequest request) {
        validateRequest(request.getPutObjectRequest());
        TeaRequest teaRequest;
        try {
            teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PutObject").setMethod(HttpMethod.PUT).setPathRegex("/{key}")
                    .setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.BINARY)
                    .formModel(request.getPutObjectRequest());
        } catch (Exception e) {
            throw new TeaException("formModel fail", e);
        }
        ClientExecutionParams params = new ClientExecutionParams().withInput(request.getPutObjectRequest()).withRequest(teaRequest);
        PresignResult result = presign(params, request);
        return PutObjectPresignResponse.builder()
                .expiration(result.getExpiration())
                .url(result.getUrl())
                .signedHeaders(result.getSignedHeaders())
                .build();
    }

    @Override
    public GetObjectPresignResponse presignGetObject(GetObjectPresignRequest request) {
        validateRequest(request.getGetObjectRequest());
        TeaRequest teaRequest;
        try {
            teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PutObject").setMethod(HttpMethod.GET).setPathRegex("/{key}")
                    .setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.BINARY)
                    .formModel(request.getGetObjectRequest());
        } catch (Exception e) {
            throw new TeaException("formModel fail", e);
        }
        ClientExecutionParams params = new ClientExecutionParams().withInput(request.getGetObjectRequest()).withRequest(teaRequest);
        PresignResult result = presign(params, request);
        return GetObjectPresignResponse.builder()
                .expiration(result.getExpiration())
                .url(result.getUrl())
                .signedHeaders(result.getSignedHeaders())
                .build();
    }

    @Override
    public UploadPartPresignResponse presignUploadPart(UploadPartPresignRequest request) {
        validateRequest(request.getUploadPartRequest());
        TeaRequest teaRequest;
        try {
            teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UploadPart").setMethod(HttpMethod.PUT).setPathRegex("/{key}").setBodyType(BodyType.XML).setBodyIsForm(false).setReqBodyType(BodyType.BINARY)
                    .formModel(request.getUploadPartRequest());
        } catch (Exception e) {
            throw new TeaException("formModel fail", e);
        }
        ClientExecutionParams params = new ClientExecutionParams().withInput(request.getUploadPartRequest()).withRequest(teaRequest);
        PresignResult result = presign(params, request);
        return UploadPartPresignResponse.builder()
                .expiration(result.getExpiration())
                .url(result.getUrl())
                .signedHeaders(result.getSignedHeaders())
                .build();
    }

    private void validateRequest(RequestModel model) {
        if (CommonUtil.isUnset(model)) {
            throw new TeaException("RequestModel is not allowed as null",
                    new RuntimeException("RequestModel is not allowed as null"));
        }
        model.validate();
    }

    private static final class PresignResult {
        private URL url;
        private Instant expiration;
        private Map<String, String> signedHeaders;

        public URL getUrl() {
            return url;
        }

        public void setUrl(URL url) {
            this.url = url;
        }

        public Instant getExpiration() {
            return expiration;
        }

        public void setExpiration(Instant expiration) {
            this.expiration = expiration;
        }

        public Map<String, String> getSignedHeaders() {
            return signedHeaders;
        }

        public void setSignedHeaders(Map<String, String> signedHeaders) {
            this.signedHeaders = signedHeaders;
        }
    }

    private <InputT extends RequestModel, OutputT extends TeaModel> PresignResult presign(ClientExecutionParams<InputT, OutputT> executionParams, PresignRequest presignRequest) {
        final InterceptorChain interceptorChain = configuration.option(ClientOption.INTERCEPTOR_CHAIN);
        final TeaConfiguration config = new TeaConfiguration(configuration, executionParams.getRequest().requestConfiguration());
        HttpHeaders headers = new HttpHeaders();
        headers.putAll(executionParams.getRequest().headers());
        headers.putAll(config.httpHeaders());
        TeaRequest request = executionParams.getRequest().copy().setHeaders(headers);
        InterceptorContext context = InterceptorContext.builder()
                .teaRequest(request)
                .configuration(config)
                .build();
        AttributeMap attributes = AttributeMap.empty();
        if (presignRequest.getSignatureDuration() != null) {
            attributes.put(AttributeKey.OSS_SIGNATURE_DURATION, presignRequest.getSignatureDuration());
        } else {
            attributes.put(AttributeKey.OSS_SIGNATURE_EXPIRATION, presignRequest.getSignatureExpiration());
        }
        context = interceptorChain.modifyRequest(context, attributes);
        interceptorChain.modifyHttpRequest(context, attributes);
        PresignResult result = new PresignResult();
        result.setExpiration(attributes.get(AttributeKey.OSS_SIGNATURE_EXPIRATION));
        result.setUrl(context.httpRequest().getUrl());
        result.setSignedHeaders(context.httpRequest().getHeaders().toMap());
        return result;
    }
}
