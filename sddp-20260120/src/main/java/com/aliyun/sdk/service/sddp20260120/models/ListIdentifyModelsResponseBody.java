// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link ListIdentifyModelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIdentifyModelsResponseBody</p>
 */
public class ListIdentifyModelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleList")
    private java.util.List<RuleList> ruleList;

    private ListIdentifyModelsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleList = builder.ruleList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIdentifyModelsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleList
     */
    public java.util.List<RuleList> getRuleList() {
        return this.ruleList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<RuleList> ruleList; 

        private Builder() {
        } 

        private Builder(ListIdentifyModelsResponseBody model) {
            this.requestId = model.requestId;
            this.ruleList = model.ruleList;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RuleList.
         */
        public Builder ruleList(java.util.List<RuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }

        public ListIdentifyModelsResponseBody build() {
            return new ListIdentifyModelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIdentifyModelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIdentifyModelsResponseBody</p>
     */
    public static class RuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private RuleList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long id; 
            private String name; 

            private Builder() {
            } 

            private Builder(RuleList model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public RuleList build() {
                return new RuleList(this);
            } 

        } 

    }
}
