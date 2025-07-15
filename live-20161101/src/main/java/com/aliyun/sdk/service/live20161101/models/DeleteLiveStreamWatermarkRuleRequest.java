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
 * {@link DeleteLiveStreamWatermarkRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteLiveStreamWatermarkRuleRequest</p>
 */
public class DeleteLiveStreamWatermarkRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("App")
    private String app;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Stream")
    private String stream;

    private DeleteLiveStreamWatermarkRuleRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.domain = builder.domain;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.ruleId = builder.ruleId;
        this.stream = builder.stream;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveStreamWatermarkRuleRequest create() {
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
     * @return domain
     */
    public String getDomain() {
        return this.domain;
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
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return stream
     */
    public String getStream() {
        return this.stream;
    }

    public static final class Builder extends Request.Builder<DeleteLiveStreamWatermarkRuleRequest, Builder> {
        private String app; 
        private String domain; 
        private Long ownerId; 
        private String regionId; 
        private String ruleId; 
        private String stream; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLiveStreamWatermarkRuleRequest request) {
            super(request);
            this.app = request.app;
            this.domain = request.domain;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.ruleId = request.ruleId;
            this.stream = request.stream;
        } 

        /**
         * <p>The name of the application to which the live stream belongs.</p>
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
         * <p>The ID of the watermark rule.</p>
         * <blockquote>
         * <p> You can obtain the rule ID by checking the value of the RuleId parameter that is returned by the <a href="https://help.aliyun.com/document_detail/2848100.html">AddLiveStreamWatermarkRule</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d -8f29-4bec2eb9****</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The name of the stream. The following matching rules apply:</p>
         * <ul>
         * <li>A stream name can be exactly matched, Example: liveStreamA.</li>
         * <li>Fuzzy match is also supported. The use of an asterisk (<code>*</code>) allows all approximate matches to be found.</li>
         * <li>You can place the asterisk before or after an approximate string.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>Fuzzy match: Only one asterisk (<code>*</code>) before or after an approximate string is allowed. The approximate string must be enclosed in <code>()</code>. Separate multiple strings with vertical bars (<code>|</code>).</p>
         * </li>
         * <li><p>For example, <code>*(t1|t2)</code> matches all streams whose name has the <code>t1</code> or <code>t2</code> suffix, and <code>(abc|123)*</code> matches all streams whose name has the <code>abc</code> or <code>123</code> prefix.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>liveStreamA</p>
         */
        public Builder stream(String stream) {
            this.putQueryParameter("Stream", stream);
            this.stream = stream;
            return this;
        }

        @Override
        public DeleteLiveStreamWatermarkRuleRequest build() {
            return new DeleteLiveStreamWatermarkRuleRequest(this);
        } 

    } 

}
