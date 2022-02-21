// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodesRequest} extends {@link RequestModel}
 *
 * <p>ListNodesRequest</p>
 */
public class ListNodesRequest extends Request {
    @Path
    @NameInMap("ResId")
    @Validation(required = true)
    private String resId;

    @Query
    @NameInMap("ecsInstanceIds")
    private String ecsInstanceIds;

    @Query
    @NameInMap("ecsInstanceName")
    private String ecsInstanceName;

    @Query
    @NameInMap("page")
    @Validation(maximum = 200, minimum = 1)
    private Integer page;

    @Query
    @NameInMap("size")
    @Validation(maximum = 10000, minimum = 1)
    private Integer size;

    @Query
    @NameInMap("tags")
    private String tags;

    private ListNodesRequest(Builder builder) {
        super(builder);
        this.resId = builder.resId;
        this.ecsInstanceIds = builder.ecsInstanceIds;
        this.ecsInstanceName = builder.ecsInstanceName;
        this.page = builder.page;
        this.size = builder.size;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resId
     */
    public String getResId() {
        return this.resId;
    }

    /**
     * @return ecsInstanceIds
     */
    public String getEcsInstanceIds() {
        return this.ecsInstanceIds;
    }

    /**
     * @return ecsInstanceName
     */
    public String getEcsInstanceName() {
        return this.ecsInstanceName;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListNodesRequest, Builder> {
        private String resId; 
        private String ecsInstanceIds; 
        private String ecsInstanceName; 
        private Integer page; 
        private Integer size; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(ListNodesRequest response) {
            super(response);
            this.resId = response.resId;
            this.ecsInstanceIds = response.ecsInstanceIds;
            this.ecsInstanceName = response.ecsInstanceName;
            this.page = response.page;
            this.size = response.size;
            this.tags = response.tags;
        } 

        /**
         * ResId.
         */
        public Builder resId(String resId) {
            this.putPathParameter("ResId", resId);
            this.resId = resId;
            return this;
        }

        /**
         * ecsInstanceIds.
         */
        public Builder ecsInstanceIds(String ecsInstanceIds) {
            this.putQueryParameter("ecsInstanceIds", ecsInstanceIds);
            this.ecsInstanceIds = ecsInstanceIds;
            return this;
        }

        /**
         * ecsInstanceName.
         */
        public Builder ecsInstanceName(String ecsInstanceName) {
            this.putQueryParameter("ecsInstanceName", ecsInstanceName);
            this.ecsInstanceName = ecsInstanceName;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public ListNodesRequest build() {
            return new ListNodesRequest(this);
        } 

    } 

}
