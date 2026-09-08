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
 * {@link ListRiskLevelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRiskLevelsResponseBody</p>
 */
public class ListRiskLevelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskLevelList")
    private java.util.List<RiskLevelList> riskLevelList;

    private ListRiskLevelsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.riskLevelList = builder.riskLevelList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRiskLevelsResponseBody create() {
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
     * @return riskLevelList
     */
    public java.util.List<RiskLevelList> getRiskLevelList() {
        return this.riskLevelList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<RiskLevelList> riskLevelList; 

        private Builder() {
        } 

        private Builder(ListRiskLevelsResponseBody model) {
            this.requestId = model.requestId;
            this.riskLevelList = model.riskLevelList;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RiskLevelList.
         */
        public Builder riskLevelList(java.util.List<RiskLevelList> riskLevelList) {
            this.riskLevelList = riskLevelList;
            return this;
        }

        public ListRiskLevelsResponseBody build() {
            return new ListRiskLevelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRiskLevelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRiskLevelsResponseBody</p>
     */
    public static class RiskLevelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ReferenceNum")
        private Integer referenceNum;

        private RiskLevelList(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.referenceNum = builder.referenceNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskLevelList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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

        /**
         * @return referenceNum
         */
        public Integer getReferenceNum() {
            return this.referenceNum;
        }

        public static final class Builder {
            private String description; 
            private Long id; 
            private String name; 
            private Integer referenceNum; 

            private Builder() {
            } 

            private Builder(RiskLevelList model) {
                this.description = model.description;
                this.id = model.id;
                this.name = model.name;
                this.referenceNum = model.referenceNum;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
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

            /**
             * ReferenceNum.
             */
            public Builder referenceNum(Integer referenceNum) {
                this.referenceNum = referenceNum;
                return this;
            }

            public RiskLevelList build() {
                return new RiskLevelList(this);
            } 

        } 

    }
}
