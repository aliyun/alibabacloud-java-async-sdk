// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountlabel20200315;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.accountlabel20200315.models.*;
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
     * @param request the request parameters of AddCustomerLabel  AddCustomerLabelRequest
     * @return AddCustomerLabelResponse
     */
    CompletableFuture<AddCustomerLabelResponse> addCustomerLabel(AddCustomerLabelRequest request);

    /**
     * @param request the request parameters of BatchFetchAccountLabel  BatchFetchAccountLabelRequest
     * @return BatchFetchAccountLabelResponse
     */
    CompletableFuture<BatchFetchAccountLabelResponse> batchFetchAccountLabel(BatchFetchAccountLabelRequest request);

    /**
     * @param request the request parameters of DeleteCustomerLabel  DeleteCustomerLabelRequest
     * @return DeleteCustomerLabelResponse
     */
    CompletableFuture<DeleteCustomerLabelResponse> deleteCustomerLabel(DeleteCustomerLabelRequest request);

    /**
     * @param request the request parameters of QueryCustomerLabel  QueryCustomerLabelRequest
     * @return QueryCustomerLabelResponse
     */
    CompletableFuture<QueryCustomerLabelResponse> queryCustomerLabel(QueryCustomerLabelRequest request);

    /**
     * @param request the request parameters of QueryCustomerLabelByConfigGroup  QueryCustomerLabelByConfigGroupRequest
     * @return QueryCustomerLabelByConfigGroupResponse
     */
    CompletableFuture<QueryCustomerLabelByConfigGroupResponse> queryCustomerLabelByConfigGroup(QueryCustomerLabelByConfigGroupRequest request);

}
