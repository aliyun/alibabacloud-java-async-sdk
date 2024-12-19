// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link CancelFavoritePublicMediaResponseBody} extends {@link TeaModel}
 *
 * <p>CancelFavoritePublicMediaResponseBody</p>
 */
public class CancelFavoritePublicMediaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IgnoredList")
    private java.util.List<String> ignoredList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CancelFavoritePublicMediaResponseBody(Builder builder) {
        this.ignoredList = builder.ignoredList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelFavoritePublicMediaResponseBody create() {
        return builder().build();
    }

    /**
     * @return ignoredList
     */
    public java.util.List<String> getIgnoredList() {
        return this.ignoredList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> ignoredList; 
        private String requestId; 

        /**
         * IgnoredList.
         */
        public Builder ignoredList(java.util.List<String> ignoredList) {
            this.ignoredList = ignoredList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CancelFavoritePublicMediaResponseBody build() {
            return new CancelFavoritePublicMediaResponseBody(this);
        } 

    } 

}
