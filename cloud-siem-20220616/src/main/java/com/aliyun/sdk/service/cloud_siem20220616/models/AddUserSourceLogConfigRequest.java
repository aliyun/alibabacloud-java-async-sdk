// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserSourceLogConfigRequest} extends {@link RequestModel}
 *
 * <p>AddUserSourceLogConfigRequest</p>
 */
public class AddUserSourceLogConfigRequest extends Request {
    @Body
    @NameInMap("Deleted")
    private Integer deleted;

    @Body
    @NameInMap("DisPlayLine")
    private String disPlayLine;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("SourceLogCode")
    private String sourceLogCode;

    @Body
    @NameInMap("SourceLogInfo")
    @Validation(required = true)
    private String sourceLogInfo;

    @Body
    @NameInMap("SourceProdCode")
    private String sourceProdCode;

    @Body
    @NameInMap("SubUserId")
    @Validation(required = true)
    private Long subUserId;

    private AddUserSourceLogConfigRequest(Builder builder) {
        super(builder);
        this.deleted = builder.deleted;
        this.disPlayLine = builder.disPlayLine;
        this.regionId = builder.regionId;
        this.sourceLogCode = builder.sourceLogCode;
        this.sourceLogInfo = builder.sourceLogInfo;
        this.sourceProdCode = builder.sourceProdCode;
        this.subUserId = builder.subUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUserSourceLogConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleted
     */
    public Integer getDeleted() {
        return this.deleted;
    }

    /**
     * @return disPlayLine
     */
    public String getDisPlayLine() {
        return this.disPlayLine;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sourceLogCode
     */
    public String getSourceLogCode() {
        return this.sourceLogCode;
    }

    /**
     * @return sourceLogInfo
     */
    public String getSourceLogInfo() {
        return this.sourceLogInfo;
    }

    /**
     * @return sourceProdCode
     */
    public String getSourceProdCode() {
        return this.sourceProdCode;
    }

    /**
     * @return subUserId
     */
    public Long getSubUserId() {
        return this.subUserId;
    }

    public static final class Builder extends Request.Builder<AddUserSourceLogConfigRequest, Builder> {
        private Integer deleted; 
        private String disPlayLine; 
        private String regionId; 
        private String sourceLogCode; 
        private String sourceLogInfo; 
        private String sourceProdCode; 
        private Long subUserId; 

        private Builder() {
            super();
        } 

        private Builder(AddUserSourceLogConfigRequest request) {
            super(request);
            this.deleted = request.deleted;
            this.disPlayLine = request.disPlayLine;
            this.regionId = request.regionId;
            this.sourceLogCode = request.sourceLogCode;
            this.sourceLogInfo = request.sourceLogInfo;
            this.sourceProdCode = request.sourceProdCode;
            this.subUserId = request.subUserId;
        } 

        /**
         * Deleted.
         */
        public Builder deleted(Integer deleted) {
            this.putBodyParameter("Deleted", deleted);
            this.deleted = deleted;
            return this;
        }

        /**
         * DisPlayLine.
         */
        public Builder disPlayLine(String disPlayLine) {
            this.putBodyParameter("DisPlayLine", disPlayLine);
            this.disPlayLine = disPlayLine;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SourceLogCode.
         */
        public Builder sourceLogCode(String sourceLogCode) {
            this.putBodyParameter("SourceLogCode", sourceLogCode);
            this.sourceLogCode = sourceLogCode;
            return this;
        }

        /**
         * SourceLogInfo.
         */
        public Builder sourceLogInfo(String sourceLogInfo) {
            this.putBodyParameter("SourceLogInfo", sourceLogInfo);
            this.sourceLogInfo = sourceLogInfo;
            return this;
        }

        /**
         * SourceProdCode.
         */
        public Builder sourceProdCode(String sourceProdCode) {
            this.putBodyParameter("SourceProdCode", sourceProdCode);
            this.sourceProdCode = sourceProdCode;
            return this;
        }

        /**
         * SubUserId.
         */
        public Builder subUserId(Long subUserId) {
            this.putBodyParameter("SubUserId", subUserId);
            this.subUserId = subUserId;
            return this;
        }

        @Override
        public AddUserSourceLogConfigRequest build() {
            return new AddUserSourceLogConfigRequest(this);
        } 

    } 

}
