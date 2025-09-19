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
 * {@link DescribeExposedInstanceCriteriaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExposedInstanceCriteriaResponseBody</p>
 */
public class DescribeExposedInstanceCriteriaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CriteriaList")
    private java.util.List<CriteriaList> criteriaList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeExposedInstanceCriteriaResponseBody(Builder builder) {
        this.criteriaList = builder.criteriaList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExposedInstanceCriteriaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return criteriaList
     */
    public java.util.List<CriteriaList> getCriteriaList() {
        return this.criteriaList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<CriteriaList> criteriaList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeExposedInstanceCriteriaResponseBody model) {
            this.criteriaList = model.criteriaList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The search conditions that are used to search for exposed assets.</p>
         */
        public Builder criteriaList(java.util.List<CriteriaList> criteriaList) {
            this.criteriaList = criteriaList;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>6D9CDB47-6191-4415-BE63-7E8B12CD4FBE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeExposedInstanceCriteriaResponseBody build() {
            return new DescribeExposedInstanceCriteriaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeExposedInstanceCriteriaResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExposedInstanceCriteriaResponseBody</p>
     */
    public static class CriteriaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Values")
        private String values;

        private CriteriaList(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CriteriaList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return values
         */
        public String getValues() {
            return this.values;
        }

        public static final class Builder {
            private String name; 
            private String type; 
            private String values; 

            private Builder() {
            } 

            private Builder(CriteriaList model) {
                this.name = model.name;
                this.type = model.type;
                this.values = model.values;
            } 

            /**
             * <p>The name of the search condition.</p>
             * 
             * <strong>example:</strong>
             * <p>instanceId</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the search condition. Valid values:</p>
             * <ul>
             * <li><strong>input</strong>: You must configure the search condition.</li>
             * <li><strong>select</strong>: You must select a search condition from the <strong>Values</strong> list.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>select</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value of the search condition. This parameter is returned only when the value of the <strong>Type</strong> parameter is <strong>select</strong>.</p>
             * <blockquote>
             * <p> If the value of the <strong>Type</strong> parameter is <strong>input</strong>, this parameter is empty.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>i-bp19r0fdd39idxhf****</p>
             */
            public Builder values(String values) {
                this.values = values;
                return this;
            }

            public CriteriaList build() {
                return new CriteriaList(this);
            } 

        } 

    }
}
