// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventsVariableListRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventsVariableListRequest</p>
 */
public class DescribeEventsVariableListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createType")
    private String createType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCodes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filterDTO")
    private String filterDTO;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scene")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scene;

    private DescribeEventsVariableListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.createType = builder.createType;
        this.eventCodes = builder.eventCodes;
        this.filterDTO = builder.filterDTO;
        this.regId = builder.regId;
        this.scene = builder.scene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventsVariableListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return createType
     */
    public String getCreateType() {
        return this.createType;
    }

    /**
     * @return eventCodes
     */
    public String getEventCodes() {
        return this.eventCodes;
    }

    /**
     * @return filterDTO
     */
    public String getFilterDTO() {
        return this.filterDTO;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    public static final class Builder extends Request.Builder<DescribeEventsVariableListRequest, Builder> {
        private String lang; 
        private String createType; 
        private String eventCodes; 
        private String filterDTO; 
        private String regId; 
        private String scene; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventsVariableListRequest request) {
            super(request);
            this.lang = request.lang;
            this.createType = request.createType;
            this.eventCodes = request.eventCodes;
            this.filterDTO = request.filterDTO;
            this.regId = request.regId;
            this.scene = request.scene;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * createType.
         */
        public Builder createType(String createType) {
            this.putQueryParameter("createType", createType);
            this.createType = createType;
            return this;
        }

        /**
         * eventCodes.
         */
        public Builder eventCodes(String eventCodes) {
            this.putQueryParameter("eventCodes", eventCodes);
            this.eventCodes = eventCodes;
            return this;
        }

        /**
         * filterDTO.
         */
        public Builder filterDTO(String filterDTO) {
            this.putQueryParameter("filterDTO", filterDTO);
            this.filterDTO = filterDTO;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * scene.
         */
        public Builder scene(String scene) {
            this.putQueryParameter("scene", scene);
            this.scene = scene;
            return this;
        }

        @Override
        public DescribeEventsVariableListRequest build() {
            return new DescribeEventsVariableListRequest(this);
        } 

    } 

}
