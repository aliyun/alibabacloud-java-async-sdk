// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentlessRegionResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentlessRegionResponseBody</p>
 */
public class ListAgentlessRegionResponseBody extends TeaModel {
    @NameInMap("RegionList")
    private java.util.List < String > regionList;

    @NameInMap("RequestId")
    private String requestId;

    private ListAgentlessRegionResponseBody(Builder builder) {
        this.regionList = builder.regionList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentlessRegionResponseBody create() {
        return builder().build();
    }

    /**
     * @return regionList
     */
    public java.util.List < String > getRegionList() {
        return this.regionList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > regionList; 
        private String requestId; 

        /**
         * RegionList.
         */
        public Builder regionList(java.util.List < String > regionList) {
            this.regionList = regionList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAgentlessRegionResponseBody build() {
            return new ListAgentlessRegionResponseBody(this);
        } 

    } 

}
