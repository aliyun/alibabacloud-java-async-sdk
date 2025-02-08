// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openapiexplorer20241130;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.openapiexplorer20241130.models.*;
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
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口支持通过POST或GET方法调用。</li>
     * <li><code>Accept-Language</code>请求头必须设置为<code>zh-CN</code>或<code>en-US</code>之一，用于指定返回结果的语言类型。</li>
     * <li>错误码格式需符合特定规则，特别是针对OSS的错误码应遵循正则表达式<code>[0-9]{4}-[0-9]{8}</code>。</li>
     * <li>当前实现中未使用<code>maxResults</code>和<code>nextToken</code>参数。</li>
     * <li>如果请求失败，将根据不同的错误情况返回相应的错误代码及描述信息。</li>
     * </ul>
     * 
     * @param request the request parameters of GetErrorCodeSolutions  GetErrorCodeSolutionsRequest
     * @return GetErrorCodeSolutionsResponse
     */
    CompletableFuture<GetErrorCodeSolutionsResponse> getErrorCodeSolutions(GetErrorCodeSolutionsRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口主要用于帮助用户通过提供具体的<code>apiRequestId</code>来获取相关API请求的详细日志信息。</li>
     * <li><code>apiRequestId</code>必须是大写形式的UUID，并且应确保该ID确实来自于您之前对某个OpenAPI的实际调用。</li>
     * <li>如果提供的<code>apiRequestId</code>无效或者没有找到对应的日志记录，系统将返回相应的错误提示。</li>
     * <li>在使用此接口时，请注意检查您的网络环境以及权限设置，以保证能够顺利访问到所需资源。</li>
     * </ul>
     * 
     * @param request the request parameters of GetOwnRequestLog  GetOwnRequestLogRequest
     * @return GetOwnRequestLogResponse
     */
    CompletableFuture<GetOwnRequestLogResponse> getOwnRequestLog(GetOwnRequestLogRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口主要用于帮助用户通过提供具体的<code>apiRequestId</code>来获取相关API请求的详细日志信息。</li>
     * <li><code>apiRequestId</code>必须是大写形式的UUID，并且应确保该ID确实来自于您之前对某个OpenAPI的实际调用。</li>
     * <li>如果提供的<code>apiRequestId</code>无效或者没有找到对应的日志记录，系统将返回相应的错误提示。</li>
     * <li>在使用此接口时，请注意检查您的网络环境以及权限设置，以保证能够顺利访问到所需资源。</li>
     * </ul>
     * 
     * @param request the request parameters of GetRequestLog  GetRequestLogRequest
     * @return GetRequestLogResponse
     */
    CompletableFuture<GetRequestLogResponse> getRequestLog(GetRequestLogRequest request);

}
