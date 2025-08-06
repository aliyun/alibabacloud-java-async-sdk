// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteAppLicenseResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAppLicenseResponseBody</p>
 */
public class DeleteAppLicenseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedLicenseItemIdList")
    private java.util.List<String> failedLicenseItemIdList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteAppLicenseResponseBody(Builder builder) {
        this.failedLicenseItemIdList = builder.failedLicenseItemIdList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppLicenseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failedLicenseItemIdList
     */
    public java.util.List<String> getFailedLicenseItemIdList() {
        return this.failedLicenseItemIdList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> failedLicenseItemIdList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteAppLicenseResponseBody model) {
            this.failedLicenseItemIdList = model.failedLicenseItemIdList;
            this.requestId = model.requestId;
        } 

        /**
         * FailedLicenseItemIdList.
         */
        public Builder failedLicenseItemIdList(java.util.List<String> failedLicenseItemIdList) {
            this.failedLicenseItemIdList = failedLicenseItemIdList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteAppLicenseResponseBody build() {
            return new DeleteAppLicenseResponseBody(this);
        } 

    } 

}
