// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link ListHotNewsWithTypeRequest} extends {@link RequestModel}
 *
 * <p>ListHotNewsWithTypeRequest</p>
 */
public class ListHotNewsWithTypeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Current")
    private Integer current;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NewsType")
    private String newsType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NewsTypes")
    private java.util.List<String> newsTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Size")
    private Integer size;

    private ListHotNewsWithTypeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.current = builder.current;
        this.newsType = builder.newsType;
        this.newsTypes = builder.newsTypes;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotNewsWithTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return newsType
     */
    public String getNewsType() {
        return this.newsType;
    }

    /**
     * @return newsTypes
     */
    public java.util.List<String> getNewsTypes() {
        return this.newsTypes;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListHotNewsWithTypeRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private Integer current; 
        private String newsType; 
        private java.util.List<String> newsTypes; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListHotNewsWithTypeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.current = request.current;
            this.newsType = request.newsType;
            this.newsTypes = request.newsTypes;
            this.size = request.size;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c160c841c8e54295bf2f441432785944_p_efm</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * Current.
         */
        public Builder current(Integer current) {
            this.putBodyParameter("Current", current);
            this.current = current;
            return this;
        }

        /**
         * NewsType.
         */
        public Builder newsType(String newsType) {
            this.putBodyParameter("NewsType", newsType);
            this.newsType = newsType;
            return this;
        }

        /**
         * NewsTypes.
         */
        public Builder newsTypes(java.util.List<String> newsTypes) {
            String newsTypesShrink = shrink(newsTypes, "NewsTypes", "json");
            this.putBodyParameter("NewsTypes", newsTypesShrink);
            this.newsTypes = newsTypes;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListHotNewsWithTypeRequest build() {
            return new ListHotNewsWithTypeRequest(this);
        } 

    } 

}
