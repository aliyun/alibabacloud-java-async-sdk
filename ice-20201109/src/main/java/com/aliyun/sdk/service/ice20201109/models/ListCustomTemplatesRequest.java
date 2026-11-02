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
 * {@link ListCustomTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListCustomTemplatesRequest</p>
 */
public class ListCustomTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Subtype")
    private String subtype;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ListCustomTemplatesRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.subtype = builder.subtype;
        this.templateId = builder.templateId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomTemplatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return subtype
     */
    public String getSubtype() {
        return this.subtype;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListCustomTemplatesRequest, Builder> {
        private String name; 
        private String orderBy; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String subtype; 
        private String templateId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListCustomTemplatesRequest request) {
            super(request);
            this.name = request.name;
            this.orderBy = request.orderBy;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.subtype = request.subtype;
            this.templateId = request.templateId;
            this.type = request.type;
        } 

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-template</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li>CreateTimeDesc: Sorts by creation time in descending order.</li>
         * <li>CreateTimeAsc: Sorts by creation time in ascending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreateTimeDesc</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The template subtype ID. Valid values:</p>
         * <ul>
         * <li>Subtypes for transcode templates:<ul>
         * <li>1: Normal transcode template (Normal).</li>
         * <li>2: Audio transcode template (AudioTranscode).</li>
         * <li>3: Remux (Remux).</li>
         * <li>4: Narrowband HD 1.0 (NarrowBandV1).</li>
         * <li>5: Narrowband HD 2.0 (NarrowBandV2).</li>
         * </ul>
         * </li>
         * <li>Subtypes for snapshot templates:<ul>
         * <li>1: Normal snapshot or static snapshot (Normal).</li>
         * <li>2: Sprite snapshot (Sprite).</li>
         * <li>3: WebVTT snapshot (WebVtt).</li>
         * </ul>
         * </li>
         * <li>Subtypes for AI content moderation templates:<ul>
         * <li>1: Video moderation (Video).</li>
         * <li>2: Audio moderation (Audio).</li>
         * <li>3: Image moderation (Image).</li>
         * </ul>
         * </li>
         * <li>Subtypes for AI intelligent erasure templates:<ul>
         * <li>1: Logo erasure (VideoDelogo).</li>
         * <li>2: Subtitle erasure (VideoDetext).</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder subtype(String subtype) {
            this.putQueryParameter("Subtype", subtype);
            this.subtype = subtype;
            return this;
        }

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The templatetype. Separate multiple values with commas. Valid values:</p>
         * <ul>
         * <li>1: Transcode template.</li>
         * <li>2: Snapshot template.</li>
         * <li>3: Animated image template.</li>
         * <li>4: Image watermark template.</li>
         * <li>5: Text watermark template.</li>
         * <li>6: Subtitle template.</li>
         * <li>7: AI content moderation.</li>
         * <li>8: AI intelligent cover.</li>
         * <li>9: AI intelligent erasure.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListCustomTemplatesRequest build() {
            return new ListCustomTemplatesRequest(this);
        } 

    } 

}
