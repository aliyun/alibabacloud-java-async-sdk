// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRdsBackUpRequest} extends {@link RequestModel}
 *
 * <p>GetRdsBackUpRequest</p>
 */
public class GetRdsBackUpRequest extends Request {
    @Body
    @NameInMap("BackupId")
    private String backupId;

    @Body
    @NameInMap("BackupType")
    private String backupType;

    @Body
    @NameInMap("DbInstanceId")
    @Validation(required = true)
    private String dbInstanceId;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    private GetRdsBackUpRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
        this.backupType = builder.backupType;
        this.dbInstanceId = builder.dbInstanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRdsBackUpRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @return backupType
     */
    public String getBackupType() {
        return this.backupType;
    }

    /**
     * @return dbInstanceId
     */
    public String getDbInstanceId() {
        return this.dbInstanceId;
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

    public static final class Builder extends Request.Builder<GetRdsBackUpRequest, Builder> {
        private String backupId; 
        private String backupType; 
        private String dbInstanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(GetRdsBackUpRequest request) {
            super(request);
            this.backupId = request.backupId;
            this.backupType = request.backupType;
            this.dbInstanceId = request.dbInstanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * BackupId.
         */
        public Builder backupId(String backupId) {
            this.putBodyParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * BackupType.
         */
        public Builder backupType(String backupType) {
            this.putBodyParameter("BackupType", backupType);
            this.backupType = backupType;
            return this;
        }

        /**
         * DbInstanceId.
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.putBodyParameter("DbInstanceId", dbInstanceId);
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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

        @Override
        public GetRdsBackUpRequest build() {
            return new GetRdsBackUpRequest(this);
        } 

    } 

}
