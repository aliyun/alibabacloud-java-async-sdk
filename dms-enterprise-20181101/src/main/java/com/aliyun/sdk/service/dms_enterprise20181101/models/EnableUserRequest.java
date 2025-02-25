// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link EnableUserRequest} extends {@link RequestModel}
 *
 * <p>EnableUserRequest</p>
 */
public class EnableUserRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uid;

    private EnableUserRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.tid = builder.tid;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<EnableUserRequest, Builder> {
        private String regionId; 
        private Long tid; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(EnableUserRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.tid = request.tid;
            this.uid = request.uid;
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
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p> To obtain the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">Tenant information</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * <p>The UID of the Alibaba Cloud account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder uid(String uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public EnableUserRequest build() {
            return new EnableUserRequest(this);
        } 

    } 

}
