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
 * {@link GetSasContainerWebDefenseRuleCriteriaResponseBody} extends {@link TeaModel}
 *
 * <p>GetSasContainerWebDefenseRuleCriteriaResponseBody</p>
 */
public class GetSasContainerWebDefenseRuleCriteriaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CriteriaList")
    private java.util.List<CriteriaList> criteriaList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSasContainerWebDefenseRuleCriteriaResponseBody(Builder builder) {
        this.criteriaList = builder.criteriaList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSasContainerWebDefenseRuleCriteriaResponseBody create() {
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

        private Builder(GetSasContainerWebDefenseRuleCriteriaResponseBody model) {
            this.criteriaList = model.criteriaList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of query criteria.</p>
         */
        public Builder criteriaList(java.util.List<CriteriaList> criteriaList) {
            this.criteriaList = criteriaList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSasContainerWebDefenseRuleCriteriaResponseBody build() {
            return new GetSasContainerWebDefenseRuleCriteriaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSasContainerWebDefenseRuleCriteriaResponseBody} extends {@link TeaModel}
     *
     * <p>GetSasContainerWebDefenseRuleCriteriaResponseBody</p>
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
             * <p>The name of the query criterion.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the query criterion. Valid values:</p>
             * <ul>
             * <li><strong>input</strong>: Input type. You must manually enter the query content when using this query criterion.</li>
             * <li><strong>select</strong>: Selection type. You must select a value from the options list (the <strong>Values</strong> field) when using this query criterion.</li>
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
             * <p>The available options when <strong>Type</strong> (the type of the query criterion) is set to <strong>select</strong> (selection type).</p>
             * <blockquote>
             * <p>When <strong>Type</strong> (the type of the query criterion) is set to <strong>input</strong> (input type), this parameter returns an empty value.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>athor_bid</p>
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
