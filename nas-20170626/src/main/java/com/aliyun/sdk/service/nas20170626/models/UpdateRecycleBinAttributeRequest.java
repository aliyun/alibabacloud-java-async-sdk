// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRecycleBinAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateRecycleBinAttributeRequest</p>
 */
public class UpdateRecycleBinAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReservedDays")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 180, minimum = 1)
    private Long reservedDays;

    private UpdateRecycleBinAttributeRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.reservedDays = builder.reservedDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRecycleBinAttributeRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateRecycleBinAttributeRequest, Builder> {
        private String fileSystemId; 
        private Long reservedDays; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRecycleBinAttributeRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.reservedDays = request.reservedDays;
        } 

        /**
         * The ID of the file system.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * The retention period of the files in the recycle bin. Unit: days.
         * <p>
         * 
         * Valid values: 1 to 180.
         * 
         * Default value: 3.
         */
        public Builder reservedDays(Long reservedDays) {
            this.putQueryParameter("ReservedDays", reservedDays);
            this.reservedDays = reservedDays;
            return this;
        }

        @Override
        public UpdateRecycleBinAttributeRequest build() {
            return new UpdateRecycleBinAttributeRequest(this);
        } 

    } 

}
