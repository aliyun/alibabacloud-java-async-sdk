// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PutExporterRuleRequest} extends {@link RequestModel}
 *
 * <p>PutExporterRuleRequest</p>
 */
public class PutExporterRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Describe")
    private String describe;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > dstNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricName")
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetWindows")
    private String targetWindows;

    private PutExporterRuleRequest(Builder builder) {
        super(builder);
        this.describe = builder.describe;
        this.dstNames = builder.dstNames;
        this.metricName = builder.metricName;
        this.namespace = builder.namespace;
        this.ruleName = builder.ruleName;
        this.targetWindows = builder.targetWindows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutExporterRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return describe
     */
    public String getDescribe() {
        return this.describe;
    }

    /**
     * @return dstNames
     */
    public java.util.List < String > getDstNames() {
        return this.dstNames;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return targetWindows
     */
    public String getTargetWindows() {
        return this.targetWindows;
    }

    public static final class Builder extends Request.Builder<PutExporterRuleRequest, Builder> {
        private String describe; 
        private java.util.List < String > dstNames; 
        private String metricName; 
        private String namespace; 
        private String ruleName; 
        private String targetWindows; 

        private Builder() {
            super();
        } 

        private Builder(PutExporterRuleRequest request) {
            super(request);
            this.describe = request.describe;
            this.dstNames = request.dstNames;
            this.metricName = request.metricName;
            this.namespace = request.namespace;
            this.ruleName = request.ruleName;
            this.targetWindows = request.targetWindows;
        } 

        /**
         * <p>The description of the data export rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Export CPU metrics</p>
         */
        public Builder describe(String describe) {
            this.putQueryParameter("Describe", describe);
            this.describe = describe;
            return this;
        }

        /**
         * <p>The destination to which the data is exported. Valid values of N: 1 to 20.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>distName1</p>
         */
        public Builder dstNames(java.util.List < String > dstNames) {
            this.putQueryParameter("DstNames", dstNames);
            this.dstNames = dstNames;
            return this;
        }

        /**
         * <p>The name of the metric.</p>
         * <blockquote>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>The namespace of the cloud service.</p>
         * <blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The name of the rule.</p>
         * <blockquote>
         * <p>If the specified rule exists, the existing rule is modified. Otherwise, a rule is created.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MyRuleName</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The time window of the exported data. Unit: seconds.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>Separate multiple time windows with commas (,).</p>
         * </li>
         * <li><p>Data in a time window of less than 60 seconds cannot be exported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>60,300</p>
         */
        public Builder targetWindows(String targetWindows) {
            this.putQueryParameter("TargetWindows", targetWindows);
            this.targetWindows = targetWindows;
            return this;
        }

        @Override
        public PutExporterRuleRequest build() {
            return new PutExporterRuleRequest(this);
        } 

    } 

}
