// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link CreateSceneDefensePolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateSceneDefensePolicyRequest</p>
 */
public class CreateSceneDefensePolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Template")
    @com.aliyun.core.annotation.Validation(required = true)
    private String template;

    private CreateSceneDefensePolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endTime = builder.endTime;
        this.name = builder.name;
        this.startTime = builder.startTime;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSceneDefensePolicyRequest create() {
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
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    public static final class Builder extends Request.Builder<CreateSceneDefensePolicyRequest, Builder> {
        private String regionId; 
        private Long endTime; 
        private String name; 
        private Long startTime; 
        private String template; 

        private Builder() {
            super();
        } 

        private Builder(CreateSceneDefensePolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endTime = request.endTime;
            this.name = request.name;
            this.startTime = request.startTime;
            this.template = request.template;
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
         * <p>The end time of the policy. This value is a UNIX timestamp. Units: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1586016000000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The name of the policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testpolicy</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The start time of the policy. This value is a UNIX timestamp. Units: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1585670400000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The template of the policy. Valid values:</p>
         * <ul>
         * <li><strong>promotion</strong>: important activity</li>
         * <li><strong>bypass</strong>: all traffic forwarded</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>promotion</p>
         */
        public Builder template(String template) {
            this.putQueryParameter("Template", template);
            this.template = template;
            return this;
        }

        @Override
        public CreateSceneDefensePolicyRequest build() {
            return new CreateSceneDefensePolicyRequest(this);
        } 

    } 

}
