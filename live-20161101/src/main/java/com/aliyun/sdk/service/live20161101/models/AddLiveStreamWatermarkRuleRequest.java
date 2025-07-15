// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link AddLiveStreamWatermarkRuleRequest} extends {@link RequestModel}
 *
 * <p>AddLiveStreamWatermarkRuleRequest</p>
 */
public class AddLiveStreamWatermarkRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("App")
    @com.aliyun.core.annotation.Validation(required = true)
    private String app;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Stream")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stream;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    private AddLiveStreamWatermarkRuleRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.description = builder.description;
        this.domain = builder.domain;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.stream = builder.stream;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLiveStreamWatermarkRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return app
     */
    public String getApp() {
        return this.app;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stream
     */
    public String getStream() {
        return this.stream;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<AddLiveStreamWatermarkRuleRequest, Builder> {
        private String app; 
        private String description; 
        private String domain; 
        private String name; 
        private Long ownerId; 
        private String regionId; 
        private String stream; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(AddLiveStreamWatermarkRuleRequest request) {
            super(request);
            this.app = request.app;
            this.description = request.description;
            this.domain = request.domain;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.stream = request.stream;
            this.templateId = request.templateId;
        } 

        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        public Builder app(String app) {
            this.putQueryParameter("App", app);
            this.app = app;
            return this;
        }

        /**
         * <p>The description of the custom rule.</p>
         * 
         * <strong>example:</strong>
         * <p>my rule</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The streaming domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The name of the custom rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WatermarkRule****</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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

        /**
         * <p>The name of the live stream. The following rules apply:</p>
         * <ul>
         * <li>A stream name can be exactly matched. Example: liveStreamA.</li>
         * <li>Fuzzy match is also supported. The use of an asterisk (<code>*</code>) allows all approximate matches to be found.</li>
         * <li>You can place the asterisk before or after an approximate string.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Fuzzy match: Only one asterisk (<code>*</code>) before or after an approximate string is allowed. The approximate string must be enclosed in <code>()</code>. Separate multiple strings with vertical bars (<code>|</code>).</li>
         * <li>For example, <code>*(t1|t2)</code> matches all streams whose name has the <code>t1</code> or <code>t2</code> suffix, and <code>(abc|123)*</code> matches all streams whose name has the <code>abc</code> or <code>123</code> prefix.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>liveStreamA</p>
         */
        public Builder stream(String stream) {
            this.putQueryParameter("Stream", stream);
            this.stream = stream;
            return this;
        }

        /**
         * <p>The ID of the watermark template.</p>
         * <blockquote>
         * <p> You can obtain the template ID by checking the value of the TemplateId parameter that is returned by the <a href="https://help.aliyun.com/document_detail/410759.html">AddLiveStreamWatermark</a> operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public AddLiveStreamWatermarkRuleRequest build() {
            return new AddLiveStreamWatermarkRuleRequest(this);
        } 

    } 

}
