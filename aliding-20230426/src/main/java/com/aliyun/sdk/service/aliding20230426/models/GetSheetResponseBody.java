// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSheetResponseBody} extends {@link TeaModel}
 *
 * <p>GetSheetResponseBody</p>
 */
public class GetSheetResponseBody extends TeaModel {
    @NameInMap("columnCount")
    private Long columnCount;

    @NameInMap("id")
    private String id;

    @NameInMap("lastNonEmptyColumn")
    private Long lastNonEmptyColumn;

    @NameInMap("lastNonEmptyRow")
    private Long lastNonEmptyRow;

    @NameInMap("name")
    private String name;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("rowCount")
    private Long rowCount;

    @NameInMap("visibility")
    private String visibility;

    private GetSheetResponseBody(Builder builder) {
        this.columnCount = builder.columnCount;
        this.id = builder.id;
        this.lastNonEmptyColumn = builder.lastNonEmptyColumn;
        this.lastNonEmptyRow = builder.lastNonEmptyRow;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.rowCount = builder.rowCount;
        this.visibility = builder.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSheetResponseBody create() {
        return builder().build();
    }

    /**
     * @return columnCount
     */
    public Long getColumnCount() {
        return this.columnCount;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return lastNonEmptyColumn
     */
    public Long getLastNonEmptyColumn() {
        return this.lastNonEmptyColumn;
    }

    /**
     * @return lastNonEmptyRow
     */
    public Long getLastNonEmptyRow() {
        return this.lastNonEmptyRow;
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
     * @return rowCount
     */
    public Long getRowCount() {
        return this.rowCount;
    }

    /**
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    public static final class Builder {
        private Long columnCount; 
        private String id; 
        private Long lastNonEmptyColumn; 
        private Long lastNonEmptyRow; 
        private String name; 
        private String requestId; 
        private Long rowCount; 
        private String visibility; 

        /**
         * columnCount.
         */
        public Builder columnCount(Long columnCount) {
            this.columnCount = columnCount;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * lastNonEmptyColumn.
         */
        public Builder lastNonEmptyColumn(Long lastNonEmptyColumn) {
            this.lastNonEmptyColumn = lastNonEmptyColumn;
            return this;
        }

        /**
         * lastNonEmptyRow.
         */
        public Builder lastNonEmptyRow(Long lastNonEmptyRow) {
            this.lastNonEmptyRow = lastNonEmptyRow;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * rowCount.
         */
        public Builder rowCount(Long rowCount) {
            this.rowCount = rowCount;
            return this;
        }

        /**
         * visibility.
         */
        public Builder visibility(String visibility) {
            this.visibility = visibility;
            return this;
        }

        public GetSheetResponseBody build() {
            return new GetSheetResponseBody(this);
        } 

    } 

}
