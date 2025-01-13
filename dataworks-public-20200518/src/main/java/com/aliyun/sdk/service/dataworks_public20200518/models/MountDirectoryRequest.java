// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link MountDirectoryRequest} extends {@link RequestModel}
 *
 * <p>MountDirectoryRequest</p>
 */
public class MountDirectoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetId")
    private String targetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetUserId")
    private String targetUserId;

    private MountDirectoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.targetId = builder.targetId;
        this.targetType = builder.targetType;
        this.targetUserId = builder.targetUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MountDirectoryRequest create() {
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
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return targetUserId
     */
    public String getTargetUserId() {
        return this.targetUserId;
    }

    public static final class Builder extends Request.Builder<MountDirectoryRequest, Builder> {
        private String regionId; 
        private String targetId; 
        private String targetType; 
        private String targetUserId; 

        private Builder() {
            super();
        } 

        private Builder(MountDirectoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.targetId = request.targetId;
            this.targetType = request.targetType;
            this.targetUserId = request.targetUserId;
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
         * <p>The ID of the directory that you want to add to the left-side navigation pane of DataAnalysis. This parameter is used together with the TargetType parameter. For example, if you set the TargetType parameter to META_ALBUM, you must set the TargetId parameter to the ID of the related data album. You can call the <a href="https://help.aliyun.com/document_detail/469938.html">ListMetaCollections</a> operation to obtain the ID of the data album. The ID is indicated by the QualifiedName parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>album.339</p>
         */
        public Builder targetId(String targetId) {
            this.putBodyParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * <p>The type of the directory that you want to add to the left-side navigation pane of DataAnalysis. Example: META_ALBUM, which indicates the data album.</p>
         * 
         * <strong>example:</strong>
         * <p>META_ALBUM</p>
         */
        public Builder targetType(String targetType) {
            this.putBodyParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The ID of the user in the tenant.</p>
         * <ul>
         * <li>If you do not configure TargetUserId, the specified directory belongs to you.</li>
         * <li>If you configure TargetUserId, the specified directory belongs to the user specified by using TargetUserId.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder targetUserId(String targetUserId) {
            this.putBodyParameter("TargetUserId", targetUserId);
            this.targetUserId = targetUserId;
            return this;
        }

        @Override
        public MountDirectoryRequest build() {
            return new MountDirectoryRequest(this);
        } 

    } 

}
