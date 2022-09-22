// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSpaceRequest} extends {@link RequestModel}
 *
 * <p>ListSpaceRequest</p>
 */
public class ListSpaceRequest extends Request {
    @Body
    @NameInMap("EmasWorkspaceId")
    private String emasWorkspaceId;

    @Body
    @NameInMap("PageNum")
    private Integer pageNum;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("SpaceIds")
    private java.util.List < String > spaceIds;

    private ListSpaceRequest(Builder builder) {
        super(builder);
        this.emasWorkspaceId = builder.emasWorkspaceId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.spaceIds = builder.spaceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSpaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return emasWorkspaceId
     */
    public String getEmasWorkspaceId() {
        return this.emasWorkspaceId;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return spaceIds
     */
    public java.util.List < String > getSpaceIds() {
        return this.spaceIds;
    }

    public static final class Builder extends Request.Builder<ListSpaceRequest, Builder> {
        private String emasWorkspaceId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private java.util.List < String > spaceIds; 

        private Builder() {
            super();
        } 

        private Builder(ListSpaceRequest request) {
            super(request);
            this.emasWorkspaceId = request.emasWorkspaceId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.spaceIds = request.spaceIds;
        } 

        /**
         * EmasWorkspaceId.
         */
        public Builder emasWorkspaceId(String emasWorkspaceId) {
            this.putBodyParameter("EmasWorkspaceId", emasWorkspaceId);
            this.emasWorkspaceId = emasWorkspaceId;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putBodyParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SpaceIds.
         */
        public Builder spaceIds(java.util.List < String > spaceIds) {
            String spaceIdsShrink = shrink(spaceIds, "SpaceIds", "simple");
            this.putBodyParameter("SpaceIds", spaceIdsShrink);
            this.spaceIds = spaceIds;
            return this;
        }

        @Override
        public ListSpaceRequest build() {
            return new ListSpaceRequest(this);
        } 

    } 

}
