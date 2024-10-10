// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
    private java.util.List < CriteriaList> criteriaList;

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

    /**
     * @return criteriaList
     */
    public java.util.List < CriteriaList> getCriteriaList() {
        return this.criteriaList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < CriteriaList> criteriaList; 
        private String requestId; 

        /**
         * <p>An array consisting of the filter conditions that are supported by the image repository.</p>
         */
        public Builder criteriaList(java.util.List < CriteriaList> criteriaList) {
            this.criteriaList = criteriaList;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
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

            /**
             * <p>The name of the search condition. Valid values:</p>
             * <ul>
             * <li><strong>instanceId</strong>: the ID of the image instance.</li>
             * <li><strong>repoName</strong>: the name of the image repository.</li>
             * <li><strong>repoId</strong>: the ID of the image repository.</li>
             * <li><strong>repoNamespace</strong>: the namespace of the image repository.</li>
             * <li><strong>regionId</strong>: the region in which the image resides.</li>
             * <li><strong>vulStatus</strong>: indicates whether vulnerabilities exist.</li>
             * <li><strong>alarmStatus</strong>: indicates whether security alerts exist.</li>
             * <li><strong>hcStatus</strong>: indicates whether baseline risks exist.</li>
             * <li><strong>riskStatus</strong>: indicates whether risks exist.</li>
             * <li><strong>registryType</strong>: the type of the image repository.</li>
             * <li><strong>ImageId</strong>: the image ID.</li>
             * <li><strong>tag</strong>: the image tag.</li>
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
             * <p>The type of the search condition. Valid values:</p>
             * <ul>
             * <li><strong>input</strong>: The search condition needs to be specified.</li>
             * <li><strong>select</strong>: The search condition is an option that can be selected from the drop-down list.</li>
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
             * <p>The values of the search condition. This parameter is returned only if the value of <strong>Type</strong> is set to <strong>select</strong>.</p>
             * <blockquote>
             * <p>If the value of <strong>Type</strong> is set to <strong>input</strong>, the return value of this parameter is empty.</p>
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
