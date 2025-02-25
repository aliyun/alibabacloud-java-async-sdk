// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetFbOssConfigRequest} extends {@link RequestModel}
 *
 * <p>GetFbOssConfigRequest</p>
 */
public class GetFbOssConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DirPrefix")
    private String dirPrefix;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsDedicatedLine")
    private Integer isDedicatedLine;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    private GetFbOssConfigRequest(Builder builder) {
        super(builder);
        this.dirPrefix = builder.dirPrefix;
        this.isDedicatedLine = builder.isDedicatedLine;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFbOssConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dirPrefix
     */
    public String getDirPrefix() {
        return this.dirPrefix;
    }

    /**
     * @return isDedicatedLine
     */
    public Integer getIsDedicatedLine() {
        return this.isDedicatedLine;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<GetFbOssConfigRequest, Builder> {
        private String dirPrefix; 
        private Integer isDedicatedLine; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(GetFbOssConfigRequest request) {
            super(request);
            this.dirPrefix = request.dirPrefix;
            this.isDedicatedLine = request.isDedicatedLine;
            this.region = request.region;
        } 

        /**
         * DirPrefix.
         */
        public Builder dirPrefix(String dirPrefix) {
            this.putBodyParameter("DirPrefix", dirPrefix);
            this.dirPrefix = dirPrefix;
            return this;
        }

        /**
         * IsDedicatedLine.
         */
        public Builder isDedicatedLine(Integer isDedicatedLine) {
            this.putBodyParameter("IsDedicatedLine", isDedicatedLine);
            this.isDedicatedLine = isDedicatedLine;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putBodyParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public GetFbOssConfigRequest build() {
            return new GetFbOssConfigRequest(this);
        } 

    } 

}
