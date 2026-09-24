// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ListCollectorsRequest} extends {@link RequestModel}
 *
 * <p>ListCollectorsRequest</p>
 */
public class ListCollectorsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resId")
    private String resId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    @com.aliyun.core.annotation.Validation(maximum = 500, minimum = 1)
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    private ListCollectorsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.page = builder.page;
        this.resId = builder.resId;
        this.size = builder.size;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCollectorsRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return resId
     */
    public String getResId() {
        return this.resId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<ListCollectorsRequest, Builder> {
        private String instanceId; 
        private String name; 
        private Integer page; 
        private String resId; 
        private Integer size; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListCollectorsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.page = request.page;
            this.resId = request.resId;
            this.size = request.size;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>The instance ID associated with the collector.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-nif1q8auz0003****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The collector name.</p>
         * 
         * <strong>example:</strong>
         * <p>collectorName1</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The page number of the returned results. Default value: 1. Minimum value: 1. Maximum value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The collector ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ct-cn-77uqof2s7rg5c****</p>
         */
        public Builder resId(String resId) {
            this.putQueryParameter("resId", resId);
            this.resId = resId;
            return this;
        }

        /**
         * <p>The number of results per page. Default value: 20. Minimum value: 1. Maximum value: 500.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The type of machine on which the collector is deployed. If this parameter is not specified, all types are returned. Valid values:</p>
         * <ul>
         * <li><p>ECS: ECS instance</p>
         * </li>
         * <li><p>ACK: Container Kubernetes cluster</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("sourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public ListCollectorsRequest build() {
            return new ListCollectorsRequest(this);
        } 

    } 

}
