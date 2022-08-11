// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ft20180713.models.*;
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

    CompletableFuture<BatchAuditTest01Response> batchAuditTest01(BatchAuditTest01Request request);

    CompletableFuture<FTApiAliasApiResponse> fTApiAliasApi(FTApiAliasApiRequest request);

    CompletableFuture<FtDynamicAddressDubboResponse> ftDynamicAddressDubbo(FtDynamicAddressDubboRequest request);

    CompletableFuture<FtDynamicAddressHsfResponse> ftDynamicAddressHsf(FtDynamicAddressHsfRequest request);

    CompletableFuture<FtDynamicAddressHttpVpcResponse> ftDynamicAddressHttpVpc(FtDynamicAddressHttpVpcRequest request);

    CompletableFuture<FtEagleEyeResponse> ftEagleEye(FtEagleEyeRequest request);

    CompletableFuture<FtFlowSpecialResponse> ftFlowSpecial(FtFlowSpecialRequest request);

    CompletableFuture<FtGatedLaunchPolicy4Response> ftGatedLaunchPolicy4(FtGatedLaunchPolicy4Request request);

    CompletableFuture<FtIpFlowControlResponse> ftIpFlowControl(FtIpFlowControlRequest request);

    CompletableFuture<FtParamListResponse> ftParamList(FtParamListRequest request);

    CompletableFuture<TestFlowStrategy01Response> testFlowStrategy01(TestFlowStrategy01Request request);

    CompletableFuture<TestHttpApiResponse> testHttpApi(TestHttpApiRequest request);

}
