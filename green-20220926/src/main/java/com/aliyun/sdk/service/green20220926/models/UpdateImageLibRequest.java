// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateImageLibRequest} extends {@link RequestModel}
 *
 * <p>UpdateImageLibRequest</p>
 */
public class UpdateImageLibRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FreeInspection")
    private Integer freeInspection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LibId")
    private String libId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LibName")
    private String libName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private UpdateImageLibRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.freeInspection = builder.freeInspection;
        this.libId = builder.libId;
        this.libName = builder.libName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateImageLibRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return freeInspection
     */
    public Integer getFreeInspection() {
        return this.freeInspection;
    }

    /**
     * @return libId
     */
    public String getLibId() {
        return this.libId;
    }

    /**
     * @return libName
     */
    public String getLibName() {
        return this.libName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateImageLibRequest, Builder> {
        private String comment; 
        private Integer freeInspection; 
        private String libId; 
        private String libName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateImageLibRequest request) {
            super(request);
            this.comment = request.comment;
            this.freeInspection = request.freeInspection;
            this.libId = request.libId;
            this.libName = request.libName;
            this.regionId = request.regionId;
        } 

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * FreeInspection.
         */
        public Builder freeInspection(Integer freeInspection) {
            this.putBodyParameter("FreeInspection", freeInspection);
            this.freeInspection = freeInspection;
            return this;
        }

        /**
         * LibId.
         */
        public Builder libId(String libId) {
            this.putBodyParameter("LibId", libId);
            this.libId = libId;
            return this;
        }

        /**
         * LibName.
         */
        public Builder libName(String libName) {
            this.putBodyParameter("LibName", libName);
            this.libName = libName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateImageLibRequest build() {
            return new UpdateImageLibRequest(this);
        } 

    } 

}
