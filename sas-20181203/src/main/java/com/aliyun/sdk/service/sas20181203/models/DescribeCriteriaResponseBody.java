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
 * {@link DescribeCriteriaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCriteriaResponseBody</p>
 */
public class DescribeCriteriaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CriteriaList")
    private java.util.List<CriteriaList> criteriaList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCriteriaResponseBody(Builder builder) {
        this.criteriaList = builder.criteriaList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCriteriaResponseBody create() {
        return builder().build();
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

        /**
         * <p>The information about the search conditions of assets.</p>
         */
        public Builder criteriaList(java.util.List<CriteriaList> criteriaList) {
            this.criteriaList = criteriaList;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>8E6DDACF-99AF-5939-AFFD-FCCD3B01E724</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCriteriaResponseBody build() {
            return new DescribeCriteriaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCriteriaResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCriteriaResponseBody</p>
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

            /**
             * <p>The structured attribute values of the assets that match the keyword. The value of this parameter is in the JSON format and contains the following fields:</p>
             * <ul>
             * <li><strong>vendor</strong>: providers.</li>
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
             * <p>The name of the search condition. Valid values:</p>
             * <ul>
             * <li><strong>internetIp</strong>: the public IP address.</li>
             * <li><strong>intranetIp</strong>: the private IP address.</li>
             * <li><strong>instanceName</strong>: the name of the instance.</li>
             * <li><strong>instanceId</strong>: the instance ID.</li>
             * <li><strong>vpcInstanceId</strong>: the ID of the virtual private cloud (VPC) to which the instance belongs.</li>
             * <li><strong>osName</strong>: the operating system.</li>
             * <li><strong>osType</strong>: the operating system type.</li>
             * <li><strong>hcStatus</strong>: indicates whether baseline risks exist.</li>
             * <li><strong>vulStatus</strong>: indicates whether vulnerabilities exist.</li>
             * <li><strong>alarmStatus</strong>: indicates whether security alerts exist.</li>
             * <li><strong>riskStatus</strong>: indicates whether risks exist.</li>
             * <li><strong>clientStatus</strong>: indicates the status of the client.</li>
             * <li><strong>runningStatus</strong>: the running status of the asset.</li>
             * <li><strong>tagName</strong>: the name of the tag.</li>
             * <li><strong>groupName</strong>: the name of the server group.</li>
             * <li><strong>regionId</strong>: the region ID.</li>
             * <li><strong>importance</strong>: the importance of the asset.</li>
             * <li><strong>exposedStatus</strong>: indicates whether the server is exposed.</li>
             * <li><strong>authVersion</strong>: the authorization version.</li>
             * <li><strong>flag</strong>: the cloud service provider.</li>
             * <li><strong>ipList</strong>: the IP addresses.</li>
             * <li><strong>uuidList</strong> :the UUID.</li>
             * <li><strong>tagKeyValue</strong>: the ECS tag.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>internetIp</p>
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
             * <p>input</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The attribute values of the assets that match the keyword.</p>
             * 
             * <strong>example:</strong>
             * <p>47.96.XX.XX</p>
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
