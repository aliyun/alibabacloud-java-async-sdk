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
         * <p>The ID of the resource with which the shipper is associated.</p>
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
         * <p>The name of the shipper.</p>
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
         * <p>The number of the page to return. Valid values: 1 to 200. Default value: 1.</p>
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
         * <p>The ID of the shipper.</p>
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
         * <p>The number of entries to return on each page. Valid values: 1 to 500. Default value: 20.</p>
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
         * <p>The type of the machine on which the shipper is deployed. If you leave this parameter empty, shippers deployed on all types of machines are returned. Valid values:</p>
         * <ul>
         * <li>ECS</li>
         * <li>ACK</li>
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
