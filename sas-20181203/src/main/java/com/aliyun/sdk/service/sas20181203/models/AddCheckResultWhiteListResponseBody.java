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
 * {@link AddCheckResultWhiteListResponseBody} extends {@link TeaModel}
 *
 * <p>AddCheckResultWhiteListResponseBody</p>
 */
public class AddCheckResultWhiteListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.Map<String, ?> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleIds")
    private java.util.List<Long> ruleIds;

    private AddCheckResultWhiteListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.ruleIds = builder.ruleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCheckResultWhiteListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleIds
     */
    public java.util.List<Long> getRuleIds() {
        return this.ruleIds;
    }

    public static final class Builder {
        private java.util.Map<String, ?> data; 
        private String requestId; 
        private java.util.List<Long> ruleIds; 

        private Builder() {
        } 

        private Builder(AddCheckResultWhiteListResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.ruleIds = model.ruleIds;
        } 

        /**
         * <p>The data returned. This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder data(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>C699E4E4-F2F4-58FC-A949-457FFE59****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The IDs of the whitelist rules that are generated.</p>
         */
        public Builder ruleIds(java.util.List<Long> ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }

        public AddCheckResultWhiteListResponseBody build() {
            return new AddCheckResultWhiteListResponseBody(this);
        } 

    } 

}
