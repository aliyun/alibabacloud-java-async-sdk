// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-0ju2s170b03</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the Query Result Searcher (QRS) worker.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-2r42ostoc01_qrs</p>
         */
        public Builder nodeName(String nodeName) {
            this.putPathParameter("nodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * <p>The name of the domain</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sz_vpc_domain_1</p>
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
