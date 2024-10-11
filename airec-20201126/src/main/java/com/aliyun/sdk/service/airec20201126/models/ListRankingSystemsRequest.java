// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRankingSystemsRequest} extends {@link RequestModel}
 *
 * <p>ListRankingSystemsRequest</p>
 */
public class ListRankingSystemsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("deployStatus")
    private String deployStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    private ListRankingSystemsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.deployStatus = builder.deployStatus;
        this.name = builder.name;
        this.page = builder.page;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRankingSystemsRequest create() {
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
     * @return deployStatus
     */
    public String getDeployStatus() {
        return this.deployStatus;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListRankingSystemsRequest, Builder> {
        private String instanceId; 
        private String deployStatus; 
        private String name; 
        private Long page; 
        private Long size; 

        private Builder() {
            super();
        } 

        private Builder(ListRankingSystemsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.deployStatus = request.deployStatus;
            this.name = request.name;
            this.page = request.page;
            this.size = request.size;
        } 

        /**
         * <p>Queries the list of ranking services.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the ranking service.</p>
         * 
         * <strong>example:</strong>
         * <p>NOT_DEPLOYED</p>
         */
        public Builder deployStatus(String deployStatus) {
            this.putQueryParameter("deployStatus", deployStatus);
            this.deployStatus = deployStatus;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>service-a</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The state of the deployment. Valid values: NOT_DEPLOYED: The ranking service is not deployed. DEPLOY_SUCCESS: The ranking service is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder size(Long size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListRankingSystemsRequest build() {
            return new ListRankingSystemsRequest(this);
        } 

    } 

}
