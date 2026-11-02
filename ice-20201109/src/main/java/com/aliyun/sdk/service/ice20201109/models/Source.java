// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link Source} extends {@link TeaModel}
 *
 * <p>Source</p>
 */
public class Source extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Arn")
    private String arn;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("HttpPackageConfigurations")
    private String httpPackageConfigurations;

    @com.aliyun.core.annotation.NameInMap("SourceLocationName")
    private String sourceLocationName;

    @com.aliyun.core.annotation.NameInMap("SourceName")
    private String sourceName;

    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("State")
    private Integer state;

    private Source(Builder builder) {
        this.arn = builder.arn;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.httpPackageConfigurations = builder.httpPackageConfigurations;
        this.sourceLocationName = builder.sourceLocationName;
        this.sourceName = builder.sourceName;
        this.sourceType = builder.sourceType;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Source create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return httpPackageConfigurations
     */
    public String getHttpPackageConfigurations() {
        return this.httpPackageConfigurations;
    }

    /**
     * @return sourceLocationName
     */
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    /**
     * @return sourceName
     */
    public String getSourceName() {
        return this.sourceName;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return state
     */
    public Integer getState() {
        return this.state;
    }

    public static final class Builder {
        private String arn; 
        private String gmtCreate; 
        private String gmtModified; 
        private String httpPackageConfigurations; 
        private String sourceLocationName; 
        private String sourceName; 
        private String sourceType; 
        private Integer state; 

        private Builder() {
        } 

        private Builder(Source model) {
            this.arn = model.arn;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.httpPackageConfigurations = model.httpPackageConfigurations;
            this.sourceLocationName = model.sourceLocationName;
            this.sourceName = model.sourceName;
            this.sourceType = model.sourceType;
            this.state = model.state;
        } 

        /**
         * <p>The ARN of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ims:mediaweaver:<regionId>:<userId>:vodSource/mySourceLocation/mySource</p>
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-07T10:12:01Z</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-07T10:12:01Z</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The source configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>[{
         *     &quot;sourceGroupName&quot;: &quot;mySourceGroup-1&quot;,
         *     &quot;relativePath&quot;: &quot;group1/hls.m3u8&quot;,
         *     &quot;packageType&quot;: &quot;hls&quot;
         * }]</p>
         */
        public Builder httpPackageConfigurations(String httpPackageConfigurations) {
            this.httpPackageConfigurations = httpPackageConfigurations;
            return this;
        }

        /**
         * <p>The name of the source location.</p>
         * 
         * <strong>example:</strong>
         * <p>MySourceLocation</p>
         */
        public Builder sourceLocationName(String sourceLocationName) {
            this.sourceLocationName = sourceLocationName;
            return this;
        }

        /**
         * <p>The name of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>MyVodSource</p>
         */
        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }

        /**
         * <p>The source type. Valid values: vodSource and liveSource.</p>
         * 
         * <strong>example:</strong>
         * <p>vodSource</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The status of the source. 0: normal. 1: deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder state(Integer state) {
            this.state = state;
            return this;
        }

        public Source build() {
            return new Source(this);
        } 

    } 

}
