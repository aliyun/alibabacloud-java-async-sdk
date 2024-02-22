// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserProdLogsRequest} extends {@link RequestModel}
 *
 * <p>ListUserProdLogsRequest</p>
 */
public class ListUserProdLogsRequest extends Request {
    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("SourceLogCode")
    @Validation(required = true)
    private String sourceLogCode;

    @Body
    @NameInMap("SourceProdCode")
    @Validation(required = true)
    private String sourceProdCode;

    private ListUserProdLogsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sourceLogCode = builder.sourceLogCode;
        this.sourceProdCode = builder.sourceProdCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserProdLogsRequest create() {
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
     * @return sourceLogCode
     */
    public String getSourceLogCode() {
        return this.sourceLogCode;
    }

    /**
     * @return sourceProdCode
     */
    public String getSourceProdCode() {
        return this.sourceProdCode;
    }

    public static final class Builder extends Request.Builder<ListUserProdLogsRequest, Builder> {
        private String regionId; 
        private String sourceLogCode; 
        private String sourceProdCode; 

        private Builder() {
            super();
        } 

        private Builder(ListUserProdLogsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.sourceLogCode = request.sourceLogCode;
            this.sourceProdCode = request.sourceProdCode;
        } 

        /**
         * The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions in China.
         * *   ap-southeast-1: Your assets reside in regions outside China.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The log code.
         */
        public Builder sourceLogCode(String sourceLogCode) {
            this.putBodyParameter("SourceLogCode", sourceLogCode);
            this.sourceLogCode = sourceLogCode;
            return this;
        }

        /**
         * The code of the cloud service.
         */
        public Builder sourceProdCode(String sourceProdCode) {
            this.putBodyParameter("SourceProdCode", sourceProdCode);
            this.sourceProdCode = sourceProdCode;
            return this;
        }

        @Override
        public ListUserProdLogsRequest build() {
            return new ListUserProdLogsRequest(this);
        } 

    } 

}
