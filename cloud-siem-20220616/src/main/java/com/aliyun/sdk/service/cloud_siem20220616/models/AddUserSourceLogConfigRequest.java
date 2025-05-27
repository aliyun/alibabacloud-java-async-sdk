// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link AddUserSourceLogConfigRequest} extends {@link RequestModel}
 *
 * <p>AddUserSourceLogConfigRequest</p>
 */
public class AddUserSourceLogConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Deleted")
    private Integer deleted;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisPlayLine")
    private String disPlayLine;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceLogCode")
    private String sourceLogCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceLogInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceLogInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceProdCode")
    private String sourceProdCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubUserId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Specifies whether to add logs or delete added logs. Valid values:</p>
         * <ul>
         * <li>-1: deletes added logs.</li>
         * <li>0: adds logs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder deleted(Integer deleted) {
            this.putBodyParameter("Deleted", deleted);
            this.deleted = deleted;
            return this;
        }

        /**
         * <p>The display details of the Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai.siem-project.siem-logstore</p>
         */
        public Builder disPlayLine(String disPlayLine) {
            this.putBodyParameter("DisPlayLine", disPlayLine);
            this.disPlayLine = disPlayLine;
            return this;
        }

        /**
         * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets reside in regions in China.</li>
         * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The log code.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_siem_aegis_proc</p>
         */
        public Builder sourceLogCode(String sourceLogCode) {
            this.putBodyParameter("SourceLogCode", sourceLogCode);
            this.sourceLogCode = sourceLogCode;
            return this;
        }

        /**
         * <p>The details of the Logstore that you want to use in the JSON string format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;project&quot;:&quot;wafnew-project-1335759343513432-cn-hangzhou&quot;,&quot;logStore&quot;:&quot;wafnew-logstore&quot;,&quot;regionCode&quot;:&quot;cn-hangzhou&quot;,&quot;prodCode&quot;:&quot;waf&quot;}</p>
         */
        public Builder sourceLogInfo(String sourceLogInfo) {
            this.putBodyParameter("SourceLogInfo", sourceLogInfo);
            this.sourceLogInfo = sourceLogInfo;
            return this;
        }

        /**
         * <p>The code of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder sourceProdCode(String sourceProdCode) {
            this.putBodyParameter("SourceProdCode", sourceProdCode);
            this.sourceProdCode = sourceProdCode;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123XXXXXX</p>
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
