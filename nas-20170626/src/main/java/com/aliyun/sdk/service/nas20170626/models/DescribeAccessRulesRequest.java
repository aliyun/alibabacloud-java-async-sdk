// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccessRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAccessRulesRequest</p>
 */
public class DescribeAccessRulesRequest extends Request {
    @Query
    @NameInMap("AccessGroupName")
    @Validation(required = true)
    private String accessGroupName;

    @Query
    @NameInMap("AccessRuleId")
    private String accessRuleId;

    @Query
    @NameInMap("FileSystemType")
    private String fileSystemType;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    private DescribeAccessRulesRequest(Builder builder) {
        super(builder);
        this.accessGroupName = builder.accessGroupName;
        this.accessRuleId = builder.accessRuleId;
        this.fileSystemType = builder.fileSystemType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessGroupName
     */
    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    /**
     * @return accessRuleId
     */
    public String getAccessRuleId() {
        return this.accessRuleId;
    }

    /**
     * @return fileSystemType
     */
    public String getFileSystemType() {
        return this.fileSystemType;
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

    public static final class Builder extends Request.Builder<DescribeAccessRulesRequest, Builder> {
        private String accessGroupName; 
        private String accessRuleId; 
        private String fileSystemType; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAccessRulesRequest response) {
            super(response);
            this.accessGroupName = response.accessGroupName;
            this.accessRuleId = response.accessRuleId;
            this.fileSystemType = response.fileSystemType;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
        } 

        /**
         * AccessGroupName.
         */
        public Builder accessGroupName(String accessGroupName) {
            this.putQueryParameter("AccessGroupName", accessGroupName);
            this.accessGroupName = accessGroupName;
            return this;
        }

        /**
         * AccessRuleId.
         */
        public Builder accessRuleId(String accessRuleId) {
            this.putQueryParameter("AccessRuleId", accessRuleId);
            this.accessRuleId = accessRuleId;
            return this;
        }

        /**
         * FileSystemType.
         */
        public Builder fileSystemType(String fileSystemType) {
            this.putQueryParameter("FileSystemType", fileSystemType);
            this.fileSystemType = fileSystemType;
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
        public DescribeAccessRulesRequest build() {
            return new DescribeAccessRulesRequest(this);
        } 

    } 

}
