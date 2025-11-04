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
 * {@link GetHotwordLibraryResponseBody} extends {@link TeaModel}
 *
 * <p>GetHotwordLibraryResponseBody</p>
 */
public class GetHotwordLibraryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("HotwordLibraryId")
    private String hotwordLibraryId;

    @com.aliyun.core.annotation.NameInMap("Hotwords")
    private java.util.List<Hotword> hotwords;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UsageScenario")
    private String usageScenario;

    private GetHotwordLibraryResponseBody(Builder builder) {
        this.creationTime = builder.creationTime;
        this.description = builder.description;
        this.hotwordLibraryId = builder.hotwordLibraryId;
        this.hotwords = builder.hotwords;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.usageScenario = builder.usageScenario;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotwordLibraryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return hotwordLibraryId
     */
    public String getHotwordLibraryId() {
        return this.hotwordLibraryId;
    }

    /**
     * @return hotwords
     */
    public java.util.List<Hotword> getHotwords() {
        return this.hotwords;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return usageScenario
     */
    public String getUsageScenario() {
        return this.usageScenario;
    }

    public static final class Builder {
        private String creationTime; 
        private String description; 
        private String hotwordLibraryId; 
        private java.util.List<Hotword> hotwords; 
        private String name; 
        private String requestId; 
        private String usageScenario; 

        private Builder() {
        } 

        private Builder(GetHotwordLibraryResponseBody model) {
            this.creationTime = model.creationTime;
            this.description = model.description;
            this.hotwordLibraryId = model.hotwordLibraryId;
            this.hotwords = model.hotwords;
            this.name = model.name;
            this.requestId = model.requestId;
            this.usageScenario = model.usageScenario;
        } 

        /**
         * <p>The time when the hotword library was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-23T13:33:49Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>The description of the hotword library.</p>
         * 
         * <strong>example:</strong>
         * <p>热词库描述</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the hotword library.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>05512043f49f697f7425</strong></strong></p>
         */
        public Builder hotwordLibraryId(String hotwordLibraryId) {
            this.hotwordLibraryId = hotwordLibraryId;
            return this;
        }

        /**
         * <p>The hotword list.</p>
         */
        public Builder hotwords(java.util.List<Hotword> hotwords) {
            this.hotwords = hotwords;
            return this;
        }

        /**
         * <p>The name of the hotword library.</p>
         * 
         * <strong>example:</strong>
         * <p>热词库名称</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>12e8864746a0a398</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The usage scenario of the hotword library.</p>
         * 
         * <strong>example:</strong>
         * <p>ASR</p>
         */
        public Builder usageScenario(String usageScenario) {
            this.usageScenario = usageScenario;
            return this;
        }

        public GetHotwordLibraryResponseBody build() {
            return new GetHotwordLibraryResponseBody(this);
        } 

    } 

}
