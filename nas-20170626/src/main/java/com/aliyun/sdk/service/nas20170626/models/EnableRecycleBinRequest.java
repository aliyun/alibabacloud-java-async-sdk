// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableRecycleBinRequest} extends {@link RequestModel}
 *
 * <p>EnableRecycleBinRequest</p>
 */
public class EnableRecycleBinRequest extends Request {
    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("ReservedDays")
    @Validation(maximum = 180, minimum = 1)
    private Long reservedDays;

    private EnableRecycleBinRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.reservedDays = builder.reservedDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableRecycleBinRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return reservedDays
     */
    public Long getReservedDays() {
        return this.reservedDays;
    }

    public static final class Builder extends Request.Builder<EnableRecycleBinRequest, Builder> {
        private String fileSystemId; 
        private Long reservedDays; 

        private Builder() {
            super();
        } 

        private Builder(EnableRecycleBinRequest response) {
            super(response);
            this.fileSystemId = response.fileSystemId;
            this.reservedDays = response.reservedDays;
        } 

        /**
         * FileSystemId.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * ReservedDays.
         */
        public Builder reservedDays(Long reservedDays) {
            this.putQueryParameter("ReservedDays", reservedDays);
            this.reservedDays = reservedDays;
            return this;
        }

        @Override
        public EnableRecycleBinRequest build() {
            return new EnableRecycleBinRequest(this);
        } 

    } 

}
