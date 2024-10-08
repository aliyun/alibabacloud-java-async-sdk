// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddOrUpdateDeviceSeatsRequest} extends {@link RequestModel}
 *
 * <p>AddOrUpdateDeviceSeatsRequest</p>
 */
public class AddOrUpdateDeviceSeatsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserCustomId")
    private String userCustomId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private AddOrUpdateDeviceSeatsRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
        this.userCustomId = builder.userCustomId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddOrUpdateDeviceSeatsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return userCustomId
     */
    public String getUserCustomId() {
        return this.userCustomId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<AddOrUpdateDeviceSeatsRequest, Builder> {
        private String fileName; 
        private String userCustomId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(AddOrUpdateDeviceSeatsRequest request) {
            super(request);
            this.fileName = request.fileName;
            this.userCustomId = request.userCustomId;
            this.zoneId = request.zoneId;
        } 

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * UserCustomId.
         */
        public Builder userCustomId(String userCustomId) {
            this.putBodyParameter("UserCustomId", userCustomId);
            this.userCustomId = userCustomId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public AddOrUpdateDeviceSeatsRequest build() {
            return new AddOrUpdateDeviceSeatsRequest(this);
        } 

    } 

}
