// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListAgentlessRegionResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentlessRegionResponseBody</p>
 */
public class ListAgentlessRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RegionList")
    private java.util.List<String> regionList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionList
     */
    public java.util.List<String> getRegionList() {
        return this.regionList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> regionList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAgentlessRegionResponseBody model) {
            this.regionList = model.regionList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the regions.</p>
         */
        public Builder regionList(java.util.List<String> regionList) {
            this.regionList = regionList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7E0618A9-D5EF-4220-9471-C42B5E92****</p>
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
