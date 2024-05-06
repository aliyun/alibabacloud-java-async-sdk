// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOnlineConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListOnlineConfigsRequest</p>
 */
public class ListOnlineConfigsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nodeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    private ListOnlineConfigsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.nodeName = builder.nodeName;
        this.domain = builder.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOnlineConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    public static final class Builder extends Request.Builder<ListOnlineConfigsRequest, Builder> {
        private String instanceId; 
        private String nodeName; 
        private String domain; 

        private Builder() {
            super();
        } 

        private Builder(ListOnlineConfigsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.nodeName = request.nodeName;
            this.domain = request.domain;
        } 

        /**
         * The ID of the instance
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the node
         */
        public Builder nodeName(String nodeName) {
            this.putPathParameter("nodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * The name of the domain
         */
        public Builder domain(String domain) {
            this.putQueryParameter("domain", domain);
            this.domain = domain;
            return this;
        }

        @Override
        public ListOnlineConfigsRequest build() {
            return new ListOnlineConfigsRequest(this);
        } 

    } 

}
