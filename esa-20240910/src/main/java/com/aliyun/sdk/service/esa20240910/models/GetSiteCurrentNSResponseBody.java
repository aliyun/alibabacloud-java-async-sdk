// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSiteCurrentNSResponseBody} extends {@link TeaModel}
 *
 * <p>GetSiteCurrentNSResponseBody</p>
 */
public class GetSiteCurrentNSResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NSList")
    private java.util.List < String > NSList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSiteCurrentNSResponseBody(Builder builder) {
        this.NSList = builder.NSList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSiteCurrentNSResponseBody create() {
        return builder().build();
    }

    /**
     * @return NSList
     */
    public java.util.List < String > getNSList() {
        return this.NSList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > NSList; 
        private String requestId; 

        /**
         * NSList.
         */
        public Builder NSList(java.util.List < String > NSList) {
            this.NSList = NSList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSiteCurrentNSResponseBody build() {
            return new GetSiteCurrentNSResponseBody(this);
        } 

    } 

}
