// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConferenceUsersRequest} extends {@link RequestModel}
 *
 * <p>ListConferenceUsersRequest</p>
 */
public class ListConferenceUsersRequest extends Request {
    @Body
    @NameInMap("ConferenceId")
    @Validation(required = true)
    private String conferenceId;

    @Body
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ListConferenceUsersRequest(Builder builder) {
        super(builder);
        this.conferenceId = builder.conferenceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConferenceUsersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conferenceId
     */
    public String getConferenceId() {
        return this.conferenceId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListConferenceUsersRequest, Builder> {
        private String conferenceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListConferenceUsersRequest request) {
            super(request);
            this.conferenceId = request.conferenceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
        } 

        /**
         * 会议唯一标识符
         */
        public Builder conferenceId(String conferenceId) {
            this.putBodyParameter("ConferenceId", conferenceId);
            this.conferenceId = conferenceId;
            return this;
        }

        /**
         * 查询页码，从第1页开始。
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 每页显示个数，最大显示个数为100。
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 地域
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListConferenceUsersRequest build() {
            return new ListConferenceUsersRequest(this);
        } 

    } 

}
