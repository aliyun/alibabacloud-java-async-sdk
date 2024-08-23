// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNotificationPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListNotificationPoliciesRequest</p>
 */
public class ListNotificationPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectedMode")
    private Boolean directedMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ids")
    private String ids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDetail")
    private Boolean isDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long size;

    private ListNotificationPoliciesRequest(Builder builder) {
        super(builder);
        this.directedMode = builder.directedMode;
        this.ids = builder.ids;
        this.isDetail = builder.isDetail;
        this.name = builder.name;
        this.page = builder.page;
        this.regionId = builder.regionId;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNotificationPoliciesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directedMode
     */
    public Boolean getDirectedMode() {
        return this.directedMode;
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return isDetail
     */
    public Boolean getIsDetail() {
        return this.isDetail;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListNotificationPoliciesRequest, Builder> {
        private Boolean directedMode; 
        private String ids; 
        private Boolean isDetail; 
        private String name; 
        private Long page; 
        private String regionId; 
        private Long size; 

        private Builder() {
            super();
        } 

        private Builder(ListNotificationPoliciesRequest request) {
            super(request);
            this.directedMode = request.directedMode;
            this.ids = request.ids;
            this.isDetail = request.isDetail;
            this.name = request.name;
            this.page = request.page;
            this.regionId = request.regionId;
            this.size = request.size;
        } 

        /**
         * Specifies whether to enable simple mode.
         */
        public Builder directedMode(Boolean directedMode) {
            this.putQueryParameter("DirectedMode", directedMode);
            this.directedMode = directedMode;
            return this;
        }

        /**
         * The ID of the notification policy.
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * Specifies whether to query the details about notification policies. Valid values:
         * <p>
         * 
         * *   `true`: Details about notification policies are queried.
         * *   `false`: Details about notification policies are not queried.
         */
        public Builder isDetail(Boolean isDetail) {
            this.putQueryParameter("IsDetail", isDetail);
            this.isDetail = isDetail;
            return this;
        }

        /**
         * The name of the notification policy.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * The ID of the region. Default value: **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder size(Long size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListNotificationPoliciesRequest build() {
            return new ListNotificationPoliciesRequest(this);
        } 

    } 

}
