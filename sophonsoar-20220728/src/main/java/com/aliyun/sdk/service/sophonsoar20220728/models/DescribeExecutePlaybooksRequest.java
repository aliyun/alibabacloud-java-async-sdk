// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExecutePlaybooksRequest} extends {@link RequestModel}
 *
 * <p>DescribeExecutePlaybooksRequest</p>
 */
public class DescribeExecutePlaybooksRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ParamType")
    private String paramType;

    @Query
    @NameInMap("PlaybookName")
    private String playbookName;

    @Query
    @NameInMap("Uuid")
    private String uuid;

    private DescribeExecutePlaybooksRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.paramType = builder.paramType;
        this.playbookName = builder.playbookName;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExecutePlaybooksRequest create() {
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
     * @return paramType
     */
    public String getParamType() {
        return this.paramType;
    }

    /**
     * @return playbookName
     */
    public String getPlaybookName() {
        return this.playbookName;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DescribeExecutePlaybooksRequest, Builder> {
        private String lang; 
        private String paramType; 
        private String playbookName; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExecutePlaybooksRequest request) {
            super(request);
            this.lang = request.lang;
            this.paramType = request.paramType;
            this.playbookName = request.playbookName;
            this.uuid = request.uuid;
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
         * ParamType.
         */
        public Builder paramType(String paramType) {
            this.putQueryParameter("ParamType", paramType);
            this.paramType = paramType;
            return this;
        }

        /**
         * PlaybookName.
         */
        public Builder playbookName(String playbookName) {
            this.putQueryParameter("PlaybookName", playbookName);
            this.playbookName = playbookName;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DescribeExecutePlaybooksRequest build() {
            return new DescribeExecutePlaybooksRequest(this);
        } 

    } 

}
