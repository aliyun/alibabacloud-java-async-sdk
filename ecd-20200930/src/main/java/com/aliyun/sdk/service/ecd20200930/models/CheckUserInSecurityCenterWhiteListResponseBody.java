// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckUserInSecurityCenterWhiteListResponseBody} extends {@link TeaModel}
 *
 * <p>CheckUserInSecurityCenterWhiteListResponseBody</p>
 */
public class CheckUserInSecurityCenterWhiteListResponseBody extends TeaModel {
    @NameInMap("InWhiteList")
    private Boolean inWhiteList;

    @NameInMap("RequestId")
    private String requestId;

    private CheckUserInSecurityCenterWhiteListResponseBody(Builder builder) {
        this.inWhiteList = builder.inWhiteList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckUserInSecurityCenterWhiteListResponseBody create() {
        return builder().build();
    }

    /**
     * @return inWhiteList
     */
    public Boolean getInWhiteList() {
        return this.inWhiteList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean inWhiteList; 
        private String requestId; 

        /**
         * InWhiteList.
         */
        public Builder inWhiteList(Boolean inWhiteList) {
            this.inWhiteList = inWhiteList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckUserInSecurityCenterWhiteListResponseBody build() {
            return new CheckUserInSecurityCenterWhiteListResponseBody(this);
        } 

    } 

}
