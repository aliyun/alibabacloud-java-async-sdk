// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDatabaseUserPermssionsRequest} extends {@link RequestModel}
 *
 * <p>ListDatabaseUserPermssionsRequest</p>
 */
public class ListDatabaseUserPermssionsRequest extends Request {
    @Query
    @NameInMap("DbId")
    @Validation(required = true)
    private String dbId;

    @Query
    @NameInMap("Logic")
    private Boolean logic;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("PermType")
    @Validation(required = true)
    private String permType;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Tid")
    private Long tid;

    @Query
    @NameInMap("UserName")
    private String userName;

    private ListDatabaseUserPermssionsRequest(Builder builder) {
        super(builder);
        this.dbId = builder.dbId;
        this.logic = builder.logic;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.permType = builder.permType;
        this.regionId = builder.regionId;
        this.tid = builder.tid;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatabaseUserPermssionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbId
     */
    public String getDbId() {
        return this.dbId;
    }

    /**
     * @return logic
     */
    public Boolean getLogic() {
        return this.logic;
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
     * @return permType
     */
    public String getPermType() {
        return this.permType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<ListDatabaseUserPermssionsRequest, Builder> {
        private String dbId; 
        private Boolean logic; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String permType; 
        private String regionId; 
        private Long tid; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(ListDatabaseUserPermssionsRequest response) {
            super(response);
            this.dbId = response.dbId;
            this.logic = response.logic;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.permType = response.permType;
            this.regionId = response.regionId;
            this.tid = response.tid;
            this.userName = response.userName;
        } 

        /**
         * DbId.
         */
        public Builder dbId(String dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * Logic.
         */
        public Builder logic(Boolean logic) {
            this.putQueryParameter("Logic", logic);
            this.logic = logic;
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

        /**
         * PermType.
         */
        public Builder permType(String permType) {
            this.putQueryParameter("PermType", permType);
            this.permType = permType;
            return this;
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
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public ListDatabaseUserPermssionsRequest build() {
            return new ListDatabaseUserPermssionsRequest(this);
        } 

    } 

}
