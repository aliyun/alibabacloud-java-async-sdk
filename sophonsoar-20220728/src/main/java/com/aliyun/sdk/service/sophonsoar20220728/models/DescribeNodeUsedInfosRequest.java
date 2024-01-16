// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNodeUsedInfosRequest} extends {@link RequestModel}
 *
 * <p>DescribeNodeUsedInfosRequest</p>
 */
public class DescribeNodeUsedInfosRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("NodeName")
    @Validation(required = true)
    private String nodeName;

    @Query
    @NameInMap("PlaybookUuid")
    @Validation(required = true)
    private String playbookUuid;

    private DescribeNodeUsedInfosRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.nodeName = builder.nodeName;
        this.playbookUuid = builder.playbookUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodeUsedInfosRequest create() {
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
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public static final class Builder extends Request.Builder<DescribeNodeUsedInfosRequest, Builder> {
        private String lang; 
        private String nodeName; 
        private String playbookUuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNodeUsedInfosRequest request) {
            super(request);
            this.lang = request.lang;
            this.nodeName = request.nodeName;
            this.playbookUuid = request.playbookUuid;
        } 

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The node name of the component.
         */
        public Builder nodeName(String nodeName) {
            this.putQueryParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * The playbook UUID.
         * <p>
         * 
         * >  You can call the [DescribePlaybooks](~~DescribePlaybooks~~)operation to query the playbook UUID.
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putQueryParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        @Override
        public DescribeNodeUsedInfosRequest build() {
            return new DescribeNodeUsedInfosRequest(this);
        } 

    } 

}
