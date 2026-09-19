// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.sandbox20260820.models.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    /**
     * @param request the request parameters of CreateTemplate  CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    /**
     * @param request the request parameters of CreateTemplateCache  CreateTemplateCacheRequest
     * @return CreateTemplateCacheResponse
     */
    CompletableFuture<CreateTemplateCacheResponse> createTemplateCache(CreateTemplateCacheRequest request);

    /**
     * @param request the request parameters of DeleteTemplate  DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    /**
     * @param request the request parameters of DeleteTemplateCache  DeleteTemplateCacheRequest
     * @return DeleteTemplateCacheResponse
     */
    CompletableFuture<DeleteTemplateCacheResponse> deleteTemplateCache(DeleteTemplateCacheRequest request);

    /**
     * @param request the request parameters of DescribeTemplateCache  DescribeTemplateCacheRequest
     * @return DescribeTemplateCacheResponse
     */
    CompletableFuture<DescribeTemplateCacheResponse> describeTemplateCache(DescribeTemplateCacheRequest request);

    /**
     * @param request the request parameters of GetTemplate  GetTemplateRequest
     * @return GetTemplateResponse
     */
    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

    /**
     * @param request the request parameters of ListTemplateCache  ListTemplateCacheRequest
     * @return ListTemplateCacheResponse
     */
    CompletableFuture<ListTemplateCacheResponse> listTemplateCache(ListTemplateCacheRequest request);

    /**
     * @param request the request parameters of ListTemplates  ListTemplatesRequest
     * @return ListTemplatesResponse
     */
    CompletableFuture<ListTemplatesResponse> listTemplates(ListTemplatesRequest request);

    /**
     * @param request the request parameters of UpdateTemplate  UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request);

}
