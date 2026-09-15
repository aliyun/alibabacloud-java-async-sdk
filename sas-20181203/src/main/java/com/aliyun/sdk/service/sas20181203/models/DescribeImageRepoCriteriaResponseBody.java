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
 * {@link DescribeImageRepoCriteriaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageRepoCriteriaResponseBody</p>
 */
public class DescribeImageRepoCriteriaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CriteriaList")
    private java.util.List<CriteriaList> criteriaList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeImageRepoCriteriaResponseBody(Builder builder) {
        this.criteriaList = builder.criteriaList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageRepoCriteriaResponseBody create() {
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

        private Builder(DescribeImageRepoCriteriaResponseBody model) {
            this.criteriaList = model.criteriaList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of supported search criteria for image repositories.</p>
         */
        public Builder criteriaList(java.util.List<CriteriaList> criteriaList) {
            this.criteriaList = criteriaList;
            return this;
        }

        /**
         * <p>The request ID. Alibaba Cloud generates a unique identifier for each API request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>F35F45B0-5D6B-4238-BE02-A62D0760E840</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageRepoCriteriaResponseBody build() {
            return new DescribeImageRepoCriteriaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageRepoCriteriaResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageRepoCriteriaResponseBody</p>
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
             * <p>The name of the search criterion. Valid values:</p>
             * <ul>
             * <li><strong>instanceId</strong>: image instance ID.</li>
             * <li><strong>repoName</strong>: repository name.</li>
             * <li><strong>repoId</strong>: repository ID.</li>
             * <li><strong>repoNamespace</strong>: repository namespace.</li>
             * <li><strong>regionId</strong>: image region.</li>
             * <li><strong>vulStatus</strong>: whether vulnerabilities exist.</li>
             * <li><strong>alarmStatus</strong>: whether security alerts exist.</li>
             * <li><strong>hcStatus</strong>: whether baseline risks exist.</li>
             * <li><strong>riskStatus</strong>: whether risks exist.</li>
             * <li><strong>registryType</strong>: repository type.</li>
             * <li><strong>imageId</strong>: image ID.</li>
             * <li><strong>tag</strong>: image tag.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vulStatus</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the search criterion. Valid values:</p>
             * <ul>
             * <li><strong>input</strong>: requires manual input of the search field.</li>
             * <li><strong>select</strong>: requires selecting a subtype from a drop-down list.</li>
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
             * <p>The available options when <strong>Type</strong> (the type of the search criterion) is <strong>select</strong> (selection type).</p>
             * <blockquote>
             * <p>When <strong>Type</strong> (the type of the search criterion) is <strong>input</strong> (input type), this parameter returns an empty value.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>NO,YES</p>
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
