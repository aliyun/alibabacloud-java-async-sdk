// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateContactGroupForAlertRequest} extends {@link RequestModel}
 *
 * <p>UpdateContactGroupForAlertRequest</p>
 */
public class UpdateContactGroupForAlertRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("alert_rule_group_name")
    private String alertRuleGroupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contact_group_ids")
    private java.util.List < Long > contactGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cr_name")
    private String crName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    private UpdateContactGroupForAlertRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.alertRuleGroupName = builder.alertRuleGroupName;
        this.contactGroupIds = builder.contactGroupIds;
        this.crName = builder.crName;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateContactGroupForAlertRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return alertRuleGroupName
     */
    public String getAlertRuleGroupName() {
        return this.alertRuleGroupName;
    }

    /**
     * @return contactGroupIds
     */
    public java.util.List < Long > getContactGroupIds() {
        return this.contactGroupIds;
    }

    /**
     * @return crName
     */
    public String getCrName() {
        return this.crName;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<UpdateContactGroupForAlertRequest, Builder> {
        private String clusterId; 
        private String alertRuleGroupName; 
        private java.util.List < Long > contactGroupIds; 
        private String crName; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(UpdateContactGroupForAlertRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.alertRuleGroupName = request.alertRuleGroupName;
            this.contactGroupIds = request.contactGroupIds;
            this.crName = request.crName;
            this.namespace = request.namespace;
        } 

        /**
         * <p>The cluster ID. You can call the ListCluster operation to query the cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ce7d08276f8a6422282c46272a84bxxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * alert_rule_group_name.
         */
        public Builder alertRuleGroupName(String alertRuleGroupName) {
            this.putBodyParameter("alert_rule_group_name", alertRuleGroupName);
            this.alertRuleGroupName = alertRuleGroupName;
            return this;
        }

        /**
         * contact_group_ids.
         */
        public Builder contactGroupIds(java.util.List < Long > contactGroupIds) {
            this.putBodyParameter("contact_group_ids", contactGroupIds);
            this.contactGroupIds = contactGroupIds;
            return this;
        }

        /**
         * cr_name.
         */
        public Builder crName(String crName) {
            this.putBodyParameter("cr_name", crName);
            this.crName = crName;
            return this;
        }

        /**
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public UpdateContactGroupForAlertRequest build() {
            return new UpdateContactGroupForAlertRequest(this);
        } 

    } 

}
