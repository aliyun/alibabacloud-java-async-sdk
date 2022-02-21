// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSipCallRecordsRequest} extends {@link RequestModel}
 *
 * <p>ListSipCallRecordsRequest</p>
 */
public class ListSipCallRecordsRequest extends Request {
    @Query
    @NameInMap("ContactIdList")
    @Validation(maximum = 4133952000000D)
    private String contactIdList;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true, maximum = 5000)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    private ListSipCallRecordsRequest(Builder builder) {
        super(builder);
        this.contactIdList = builder.contactIdList;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSipCallRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactIdList
     */
    public String getContactIdList() {
        return this.contactIdList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<ListSipCallRecordsRequest, Builder> {
        private String contactIdList; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListSipCallRecordsRequest response) {
            super(response);
            this.contactIdList = response.contactIdList;
            this.instanceId = response.instanceId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
        } 

        /**
         * ContactIdList.
         */
        public Builder contactIdList(String contactIdList) {
            this.putQueryParameter("ContactIdList", contactIdList);
            this.contactIdList = contactIdList;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListSipCallRecordsRequest build() {
            return new ListSipCallRecordsRequest(this);
        } 

    } 

}
