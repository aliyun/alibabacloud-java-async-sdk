// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeNodeUsedInfosRequest} extends {@link RequestModel}
 *
 * <p>DescribeNodeUsedInfosRequest</p>
 */
public class DescribeNodeUsedInfosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The node name of the component.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>python3_2</p>
         */
        public Builder nodeName(String nodeName) {
            this.putQueryParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * <p>The playbook UUID.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a>operation to query the playbook UUID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ac343acc-1a61-4084-9a1c-xxxx</p>
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
