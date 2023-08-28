// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOnlineConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListOnlineConfigsRequest</p>
 */
public class ListOnlineConfigsRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("nodeName")
    @Validation(required = true)
    private String nodeName;

    @Query
    @NameInMap("domain")
    @Validation(required = true)
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
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * nodeName.
         */
        public Builder nodeName(String nodeName) {
            this.putPathParameter("nodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * domain.
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
