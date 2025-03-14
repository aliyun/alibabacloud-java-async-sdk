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
 * {@link GetCloudAssetCriteriaResponseBody} extends {@link TeaModel}
 *
 * <p>GetCloudAssetCriteriaResponseBody</p>
 */
public class GetCloudAssetCriteriaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CriteriaList")
    private java.util.List<CriteriaList> criteriaList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCloudAssetCriteriaResponseBody(Builder builder) {
        this.criteriaList = builder.criteriaList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudAssetCriteriaResponseBody create() {
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

        private Builder(GetCloudAssetCriteriaResponseBody model) {
            this.criteriaList = model.criteriaList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array consisting of the information about the filter conditions that are used to search for cloud assets.</p>
         */
        public Builder criteriaList(java.util.List<CriteriaList> criteriaList) {
            this.criteriaList = criteriaList;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>24A20733-10A0-4AF6-BE6B-E3322413BB68</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCloudAssetCriteriaResponseBody build() {
            return new GetCloudAssetCriteriaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCloudAssetCriteriaResponseBody} extends {@link TeaModel}
     *
     * <p>GetCloudAssetCriteriaResponseBody</p>
     */
    public static class CriteriaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MultiValues")
        private String multiValues;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Values")
        private String values;

        private CriteriaList(Builder builder) {
            this.multiValues = builder.multiValues;
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
         * @return multiValues
         */
        public String getMultiValues() {
            return this.multiValues;
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
            private String multiValues; 
            private String name; 
            private String type; 
            private String values; 

            private Builder() {
            } 

            private Builder(CriteriaList model) {
                this.multiValues = model.multiValues;
                this.name = model.name;
                this.type = model.type;
                this.values = model.values;
            } 

            /**
             * <p>The structured attribute values of the assets that match the keyword. The value of this parameter is in the JSON format and contains the following fields:</p>
             * <ul>
             * <li><strong>vendor</strong>: providers</li>
             * <li><strong>regionIds</strong>: IDs of supported regions</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;vendor&quot;:0,&quot;regionIds&quot;:{&quot;default&quot;:[&quot;ap-southeast-1&quot;,&quot;ap-northeast-2&quot;,&quot;ap-southeast-3&quot;,&quot;ap-southeast-5&quot;,&quot;ap-southeast-7&quot;,&quot;me-central-1&quot;]}},{&quot;vendor&quot;:1,&quot;regionIds&quot;:{&quot;default&quot;:[&quot;outside-of-aliyun&quot;]}}]</p>
             */
            public Builder multiValues(String multiValues) {
                this.multiValues = multiValues;
                return this;
            }

            /**
             * <p>The name of the filter condition. Valid values:</p>
             * <ul>
             * <li><strong>instanceId</strong>: the ID of the instance</li>
             * <li><strong>instanceName</strong>: the name of an instance</li>
             * <li><strong>internetIp</strong>: the public IP address</li>
             * <li><strong>riskStatus</strong>: the risk status</li>
             * <li><strong>vendorRegionId</strong>: the region ID by service provider</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>instanceId</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the filter condition. Valid values:</p>
             * <ul>
             * <li><strong>input</strong>: The filter condition needs to be specified.</li>
             * <li><strong>select</strong>: The filter condition is an option that can be selected from the drop-down list.</li>
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
             * <p>The values of the search condition. This parameter is returned only if the value of <strong>Type</strong> is <strong>select</strong>.</p>
             * <blockquote>
             * <p> If the value of <strong>Type</strong> is <strong>input</strong>, the value of this parameter is an empty string.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>fvt*</p>
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
