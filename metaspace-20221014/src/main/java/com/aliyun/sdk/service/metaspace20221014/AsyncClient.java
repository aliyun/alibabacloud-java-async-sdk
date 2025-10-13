// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.metaspace20221014;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.metaspace20221014.models.*;
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
     * <li>该API为内部使用，主要用于协同者发起流协同。</li>
     * <li><code>DependOnMainStream</code>参数指定了是否依赖主流的状态来建立或断开协同流。</li>
     * <li>当<code>InitiatorType</code>设置为强制协同类型时（如<code>ADMIN_INITIATE_FORCE</code>或<code>COORDINATOR_INITIATE_FORCE</code>），将返回一个<code>CoordinateTicket</code>。</li>
     * <li>协同资源列表<code>CoordinationResourceCandidates</code>中必须包含至少一项资源信息，并且所有提供的资源ID、类型和地区等信息需准确无误。</li>
     * <li>确保<code>OwnerAliUid</code>与协同者的租户ID相同，否则可能无法成功发起协同请求。</li>
     * <li>对于AD用户，请务必填写<code>AdDomainName</code>字段。</li>
     * </ul>
     * 
     * @param request the request parameters of ApplyCoordinationForCoordinator  ApplyCoordinationForCoordinatorRequest
     * @return ApplyCoordinationForCoordinatorResponse
     */
    CompletableFuture<ApplyCoordinationForCoordinatorResponse> applyCoordinationForCoordinator(ApplyCoordinationForCoordinatorRequest request);

    /**
     * @param request the request parameters of CancelCoordination  CancelCoordinationRequest
     * @return CancelCoordinationResponse
     */
    CompletableFuture<CancelCoordinationResponse> cancelCoordination(CancelCoordinationRequest request);

    /**
     * @param request the request parameters of GetCoordinationTicket  GetCoordinationTicketRequest
     * @return GetCoordinationTicketResponse
     */
    CompletableFuture<GetCoordinationTicketResponse> getCoordinationTicket(GetCoordinationTicketRequest request);

}
