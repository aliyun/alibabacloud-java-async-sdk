// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDoctorHDFSUGIRequest} extends {@link RequestModel}
 *
 * <p>GetDoctorHDFSUGIRequest</p>
 */
public class GetDoctorHDFSUGIRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DateTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private GetDoctorHDFSUGIRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.dateTime = builder.dateTime;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDoctorHDFSUGIRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dateTime
     */
    public String getDateTime() {
        return this.dateTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetDoctorHDFSUGIRequest, Builder> {
        private String clusterId; 
        private String dateTime; 
        private String name; 
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetDoctorHDFSUGIRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.dateTime = request.dateTime;
            this.name = request.name;
            this.regionId = request.regionId;
            this.type = request.type;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac8fe****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Specify the date in the ISO 8601 standard. For example, 2023-01-01 represents January 1, 2023.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-01</p>
         */
        public Builder dateTime(String dateTime) {
            this.putQueryParameter("DateTime", dateTime);
            this.dateTime = dateTime;
            return this;
        }

        /**
         * <p>Set this parameter based on the value of Type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DW</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The filter condition. Valid values:</p>
         * <ul>
         * <li>user</li>
         * <li>group</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetDoctorHDFSUGIRequest build() {
            return new GetDoctorHDFSUGIRequest(this);
        } 

    } 

}
